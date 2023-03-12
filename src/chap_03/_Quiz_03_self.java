package chap_03;

public class _Quiz_03_self {
    public static void main(String[] args) {
        // 주민등록번호 변수 선언
        String idNum_Man = "901231-1234567";
        String idNum_Woman = "030708-4567890";

        // 생년월일 및 성별까지만 출력
        System.out.println(idNum_Man.substring(idNum_Man.indexOf("9"), idNum_Man.lastIndexOf("23")));
        System.out.println(idNum_Woman.substring(idNum_Woman.indexOf("0"), idNum_Woman.lastIndexOf("56")));
    }
}