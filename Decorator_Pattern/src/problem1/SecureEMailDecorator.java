package problem1;

// �⺻ ���� ������ ��ȣȭ�ϴ� Ŭ����
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



