
public class Keyword {
	private String keyword;
	private int score;
	
	Keyword(String keyString , int scoreInt){
		this.keyword = keyString;
		this.score = scoreInt;
	}
	
	@Override
	public String toString() {
		return "KeyWords [ "+  keyword + " , " + score+"]" ;
	}
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	
	
}
