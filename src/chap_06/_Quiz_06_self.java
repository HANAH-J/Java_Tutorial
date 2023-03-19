package chap_06;

public class _Quiz_06_self {
    public static String getHiddenData(String data, int index) {
        String hide = data.substring(0, index);
        for (int i = index; i < data.length(); i++) {
            hide += "*";
        }
        return hide;
    }

    public static void main(String[] args) {
        String name = "나코딩"; // 이름
        String  id = "970214-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}