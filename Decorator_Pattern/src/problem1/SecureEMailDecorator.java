package problem1;

// 기본 메일 내용을 암호화하는 클래스
public class SecureEMailDecorator extends Decorator {
	public SecureEMailDecorator(Content decoratorContent) {
		super(decoratorContent);
	}
	
	@Override
	public String getContent() {
		String content = super.getContent();
		String encryptedContent = encrypt(content);
		return encryptedContent;
	}
	
	private String encrypt(String content) {
		return content + " Encrypted";
	}
}



