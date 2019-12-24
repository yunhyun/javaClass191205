package javaClass_191224_01;

public class BookingTicket extends Ticket {
	int bookingDays;
	
	BookingTicket(int ticketNum, double ticketPrice, int bookingDays){
		super(ticketNum, ticketPrice);
		this.bookingDays = bookingDays;
	}
	
	// 메소드 오버라이딩(재정의)
	@Override
	double getTicketPrice() {
		if(bookingDays>=30) {
			ticketPrice = ticketPrice * 0.5;
		} else if(bookingDays>=10) {
			ticketPrice = ticketPrice * 0.8;
		} else if(bookingDays>=5) {
			ticketPrice = ticketPrice * 0.9;
		}
		return ticketPrice;
	}
	
	
	
	
}
