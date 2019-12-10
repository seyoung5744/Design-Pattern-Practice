package problem1;

//기본 메일 내용을 정의한 클래스
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


