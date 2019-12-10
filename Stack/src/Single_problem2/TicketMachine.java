package Single_problem2;

public class TicketMachine{
	private static TicketMachine ticketMachine = new TicketMachine();;
	private int limitTicketNum;
	private int serial; //�ø��� ��ȣ�� Ƽ�� ��迡�� �߱�
	
	private TicketMachine() {
		serial = 0;
	}
	
	public static TicketMachine getInstance() {
		return ticketMachine;
	}
	
	public Ticket getTicket() {
		if(serial < limitTicketNum) // Ƽ�� ������ �����Ǿ� �����Ƿ� �ø��� ��ȣ�� Ƽ�� �������� ���� ������ Ƽ�� ����
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
