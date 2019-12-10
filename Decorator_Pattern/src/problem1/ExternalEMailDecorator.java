package problem1;

// 기본 메일 내용에 "Company Disclaimer"를 추가하는 클래스
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




