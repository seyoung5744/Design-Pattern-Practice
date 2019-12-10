package problem1;

// 기본 메일 내용에 추가적인 내용의 하위 클래스를 정의할 때
// Component에 정의된 메소드를 호출하기 위한 Decorator 클래스
public class Decorator extends Content{
	private Content decoratorContent;
	
	public Decorator(Content decoratorContent) {
		this.decoratorContent = decoratorContent;
	}
	
	@Override
	public String getContent() {
		return decoratorContent.getContent();
	}
}

