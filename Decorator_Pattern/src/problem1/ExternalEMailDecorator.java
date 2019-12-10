package problem1;

// �⺻ ���� ���뿡 "Company Disclaimer"�� �߰��ϴ� Ŭ����
public class ExternalEMailDecorator extends Decorator {
	public ExternalEMailDecorator(Content decoratorContent) {
		super(decoratorContent);
	}
	
	@Override
	public String getContent() {
		String content = super.getContent();
		String externalContent = addDisclaimer(content);
		return externalContent;
	}
	
	private String addDisclaimer(String content) {
		return content + " Company Disclaimer";
	}
}




