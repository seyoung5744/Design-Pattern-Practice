package problem1;

public class Client {
	public static void main(String[] args) {
		Content simple = new BasicEMailContent("Hello");
		System.out.println(simple.getContent());
		
		// 외부 메일 기능
		Content external = new ExternalEMailDecorator(simple);
		System.out.println(external.getContent());
		
		// 보안 메일 기능
		Content secure = new SecureEMailDecorator(simple);
		System.out.println(secure.getContent());
		
		// 외부 메일 + 보안 메일
		Content externalSecure = new SecureEMailDecorator(external);
		System.out.println(externalSecure.getContent());
		
	}
}



