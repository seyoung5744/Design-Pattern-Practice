package Single_problem2;

public class Client {
	private static final int LIMIT_NUM = 20;
	
	public static void main(String[] args) {
		TicketMachine ticketMachine = TicketMachine.getInstance();
		ticketMachine.setLimitTicketNum(10); // 티켓 개수는 10개로 한정
		
		UserBehavior[] user = new UserBehavior[LIMIT_NUM]; // 20개의 티켓을 요구
		for(int i = 0; i < LIMIT_NUM; i++) {
			user[i] = new UserBehavior((i + 1) + "-thread");
			user[i].start();
		}
		
		for(int i = 0; i < LIMIT_NUM; i++) {
			try {
				user[i].join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < LIMIT_NUM; i++) {
			if(user[i].getMyTicket().getTicketNum() != 0) {
				System.out.println("User" + i + " Thread buy ticket" + user[i].getMyTicket().getTicketNum());
			}
		}
		
	}
}
