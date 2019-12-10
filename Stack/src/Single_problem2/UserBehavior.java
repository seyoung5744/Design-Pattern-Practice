package Single_problem2;

public class UserBehavior extends Thread{
	private Ticket ticket;
	
	public UserBehavior(String name) {
		super(name);
	}
	
	public void run() {
		TicketMachine ticketMachine = TicketMachine.getInstance();
		ticket = ticketMachine.getTicket(); // Ƽ�� ����
	}
	
	public Ticket getMyTicket() {
		return ticket;
	}
}
