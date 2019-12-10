package Single_problem2;

public class ValidTicket implements Ticket{
	
	private int serial;
	
	public ValidTicket(int serial) {
		this.serial = serial;
	}
	@Override
	public int getTicketNum() {
		return serial;
	}
}
