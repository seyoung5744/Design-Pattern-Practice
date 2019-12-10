package Single_problem2;

public class UserBehavior extends Thread{
	private Ticket ticket;
	
	public UserBehavior(String name) {
		super(name);
	}
	
	public void run() {
		TicketMachine ticketMachine = TicketMachine.getInstance();
		ticket = ticketMachine.getTicket(); // 티켓 구입
	}
	
	public Ticket getMyTicket() {
		return ticket;
	}
}
