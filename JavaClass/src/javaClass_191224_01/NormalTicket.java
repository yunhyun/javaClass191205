package javaClass_191224_01;

public class NormalTicket extends Ticket {
	boolean payByCredit;
	
	NormalTicket(int ticketNum, double ticketPrice, boolean payByCredit){
		super(ticketNum, ticketPrice);
		this.payByCredit = payByCredit;
	}
	
	@Override 
	double getTicketPrice() {
		if(payByCredit)
			return ticketPrice * 1.05;
		else 
			return ticketPrice;
	}
	

}
