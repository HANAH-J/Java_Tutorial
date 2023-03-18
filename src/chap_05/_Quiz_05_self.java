package chap_05;

public class _Quiz_05_self {
    public static void main(String[] args) {
        // 신발 사이즈 배열 선언
        int[] size = {250, 255, 260, 265, 270, 275, 280, 285, 290, 295};

        // 출력
        for (int i = 0; i < size.length; i++) {
            System.out.println("사이즈 " + size[i] + " (재고 있음)");
        }
    }
}