package example;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{ //��üȭ�� ���� ���� ��� ������
	private List<Integer> scores = new ArrayList<>();
	public void addScore(int score) {
		scores.add(score);
		nitifyObserver(); // ������ ������ �뺸 
	}
	
	public List<Integer> getScoreRecord(){
		return scores;
	}
}
