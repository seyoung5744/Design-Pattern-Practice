package problem1;

public class Client {
	public static void main(String[] args) {
		Content simple = new BasicEMailContent("Hello");
		System.out.println(simple.getContent());
		
		// �ܺ� ���� ���
		Content external = new ExternalEMailDecorator(simple);
		System.out.println(external.getContent());
		
		// ���� ���� ���
		Content secure = new SecureEMailDecorator(simple);
		System.out.println(secure.getContent());
		
		// �ܺ� ���� + ���� ����
		Content externalSecure = new SecureEMailDecorator(external);
		System.out.println(externalSecure.getContent());
		
	}
}



