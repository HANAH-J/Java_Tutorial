package extend.ex03;

public class QNAArticle extends Article {
	private String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	//toString()의 용도: 모든 멤버변수를 출력하는 용도로 override해서 많이 사용한다.
	@Override
	public String toString() {
		return "질문/답변[번호= " + getNum() + ", 제목= " + getTitle() + ", 답변= " + answer + "]";
	}

//	@Override
//	public String toString() {
//		return "QNAArticle [answer=" + answer + ", getAnswer()=" + getAnswer() + ", getNum()=" + getNum()
//				+ ", getTitle()=" + getTitle() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
//	}
}