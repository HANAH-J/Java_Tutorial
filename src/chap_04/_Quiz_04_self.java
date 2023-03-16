package chap_04;

public class _Quiz_04_self {
    public static void main(String[] args) {
        // 주차요금 : 시간당 4000원 (일일 최대 요금 : 30000원)
        // 경차 또는 장애인 차량 : 최종 요금에서 50% 할인

        // 차량 변수 선언
        // String car = "일반 차량";
        // String car = "경차";
        String car = "장애인 차량";

        // 주차 시간 변수 선언
        // int hour = 5;
        int hour = 10;

        // 주차요금 변수 선언
        int fee = 4000; // 시간당 주차요금
        int result = hour * fee; // 초기 주차요금
        int max = 30000; //최대 주차요금
        double discount = 0.5; // 할인

        if (car.equals("경차") || car.equals("장애인 차량") && result > max) {
            result = 30000;
            System.out.println("주차 요금은 " + (int) (result - (result * discount)) + "원입니다.");
            } else if (car.equals("경차") || car.equals("장애인 차량") && result < max) {
            System.out.println("주차 요금은 " + (int) (result - (result * discount)) + "원입니다.");
            } else if (car.equals("일반 차량") && result > max) {
            result = 30000;
            System.out.println("주차 요금은 " + result + "원입니다.");
            } else {
            System.out.println("주차 요금은 " + result + "원입니다.");
        }
    }
}