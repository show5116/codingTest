package programmers.level1;

public class 부족한금액계산하기 {

    public static void main(String[] args) {
        solution(3,20,4);
    }

    public static long solution(int price, int money, int count) {
        long answer = -1;
        int totalPrice = 0;

        for(int i=1; i<=count; i++) {
            totalPrice += price * i;
        }

        answer = (totalPrice > money) ? totalPrice-money : 0;
        return answer;
    }
}
