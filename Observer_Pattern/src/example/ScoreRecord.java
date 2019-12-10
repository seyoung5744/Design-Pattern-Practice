package example;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{ //구체화된 변경 감시 대상 데이터
	private List<Integer> scores = new ArrayList<>();
	public void addScore(int score) {
		scores.add(score);
		nitifyObserver(); // 데이터 변경을 통보 
	}
	
	public List<Integer> getScoreRecord(){
		return scores;
	}
}
