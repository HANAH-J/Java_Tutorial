package extend.ex03;

public class Extends {
	public static void main(String[] args) {
		FileArticle fileArticle = new FileArticle();
		
		fileArticle.setNum(1);	//부모의 글번호 세팅하는 메소드
		fileArticle.setTitle("첫 번째 자료입니다.");	//부모의 제목 세팅하는 메소드
		fileArticle.setFileName("java.ppt");	//자식이 생성한 메소드
		
		System.out.println("===============");
		System.out.println(fileArticle);
		//System.out.println()에 객체를 넘겨주면 메소드 안에서 간접적으로 toString() 메소드가 호출된다. 해당 클래스의 주소값을 출력해주는 것이다.
		System.out.println(fileArticle.toString());
		
		QNAArticle qa = new QNAArticle();
		qa.setNum(2);
		qa.setTitle("돌아오는 윤년은 몇 년도인가요?");
		qa.setAnswer("2024년입니다.");
		
		System.out.println("===============");
		System.out.println(qa);
		//toString()의 용도: 모든 멤버변수를 출력하는 용도로 override해서 많이 사용한다.
		System.out.println(qa.toString());
	}
}