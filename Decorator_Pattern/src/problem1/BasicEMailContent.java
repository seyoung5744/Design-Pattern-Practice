package problem1;

//�⺻ ���� ������ ������ Ŭ����
public class BasicEMailContent extends Content{
	private String content;
	
	public BasicEMailContent(String content) {
		this.content = content;
	}
	
	@Override
	public String getContent() {
		return content;
	}
}


