package problem3;

public class Client {
	public static void main(String[] args) { // 누적 금액 출력, 정책 적용 시 책값 출력
		Member member = new Member("won");
		
		Book book = new Book("Java 패턴화", 2015, 28000);
		
		Rental rental1 = new Rental(member, book, new OrdinaryDiscount(), 5);
		Rental rental2 = new Rental(member, book, new MemberDiscount(), 5);
		Rental rental3 = new Rental(member, book, new BookSelfDiscount(), 5);
		
		System.out.println("이름 : " + member.getName() + "/ 빌린 책 이름 : " + book.getSign());
		System.out.println("할일 적용 안했을 시 책 가격 : " + rental1.getPricePolicy());
		System.out.println("회원 할인 일 때 책 가격 : " + rental2.getPricePolicy());
		System.out.println("책 자체 할인일 때 가격 : " + rental3.getPricePolicy());
		System.out.println("누적 대여 금액 : " + member.getAccPrice());
	}
}
