package programmers.level1;

public class 없는숫자더하기 {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4,6,7,8,0});
        solution(new int[]{5,8,4,0,6,7,9});
    }

    public static int solution(int[] numbers) {
        int answer = 45;
        for(int number : numbers) {
            answer -= number;
        }
        return answer;
    }
}
