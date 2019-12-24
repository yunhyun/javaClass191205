package javaClass_191224_01;

public class TicketMain {

	public static void main(String[] args) {
		
		BookingTicket bt = new BookingTicket(1, 100000, 40);
		System.out.println(bt.getTicketPrice());
		
		NormalTicket nt = new NormalTicket(2, 100000, true);
		System.out.println(nt.getTicketPrice());
		
	}

}
