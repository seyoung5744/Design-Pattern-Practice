package Single_problem2;

public class TicketMachine{
	private static TicketMachine ticketMachine = new TicketMachine();;
	private int limitTicketNum;
	private int serial; //시리얼 번호는 티켓 기계에서 발급
	
	private TicketMachine() {
		serial = 0;
	}
	
	public static TicketMachine getInstance() {
		return ticketMachine;
	}
	
	public Ticket getTicket() {
		if(serial < limitTicketNum) // 티켓 개수는 한정되어 있으므로 시리얼 번호가 티켓 개수보다 작을 때까지 티켓 발행
			return new ValidTicket(++serial);
		return new InvalidTicket();
	}
	
	public void setLimitTicketNum(int limitTicketNum) {
		this.limitTicketNum = limitTicketNum;
	}
	
	public int getLimitTicketNum() {
		return this.limitTicketNum;
	}
	
}
