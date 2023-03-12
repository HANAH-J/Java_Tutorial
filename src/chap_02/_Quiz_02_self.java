package chap_02;

public class _Quiz_02_self {
    public static void main(String[] args) {
        // 변수 키 선언
        int height;

        // 변수 키 대입
        height = 115;

        // 탑승 가능 여부 삼항연산자
        String pass = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";

        // 출력
        System.out.println("키가 " + height + "cm 이므로 " + pass);

        // 변수 키 변경;
        height = 121;

        // 변수 키 변경 후 출력
        System.out.println("키가 " + height + "이므로" + pass);
    }
}