package problem3;

public class Client {
	public static void main(String[] args) { // ���� �ݾ� ���, ��å ���� �� å�� ���
		Member member = new Member("won");
		
		Book book = new Book("Java ����ȭ", 2015, 28000);
		
		Rental rental1 = new Rental(member, book, new OrdinaryDiscount(), 5);
		Rental rental2 = new Rental(member, book, new MemberDiscount(), 5);
		Rental rental3 = new Rental(member, book, new BookSelfDiscount(), 5);
		
		System.out.println("�̸� : " + member.getName() + "/ ���� å �̸� : " + book.getSign());
		System.out.println("���� ���� ������ �� å ���� : " + rental1.getPricePolicy());
		System.out.println("ȸ�� ���� �� �� å ���� : " + rental2.getPricePolicy());
		System.out.println("å ��ü ������ �� ���� : " + rental3.getPricePolicy());
		System.out.println("���� �뿩 �ݾ� : " + member.getAccPrice());
	}
}
