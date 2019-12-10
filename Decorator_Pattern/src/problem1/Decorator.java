package problem1;

// �⺻ ���� ���뿡 �߰����� ������ ���� Ŭ������ ������ ��
// Component�� ���ǵ� �޼ҵ带 ȣ���ϱ� ���� Decorator Ŭ����
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

