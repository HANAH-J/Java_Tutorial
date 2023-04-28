package classes;

public class Ex24_Prac {
	public static void main(String[] args) {
		Ex24_Article article = new Ex24_Article(1, "게시물", "자바 빈즈를 테스트합니다.", "자바학생", 123, "2023-03-07");
		
		System.out.println(article.getSeq());
		System.out.println(article.getSubject());
		System.out.println(article.getContent());
		System.out.println(article.getWriter());
		System.out.println(article.getHit());
		System.out.println(article.getRegDate());
	}
}