package programmers.gabia;

public class four {

    /**
     * 게임에 접속한 모든 유저에게 아이템을 지급하는 출석 이벤트를 k일 동안 진행하려 합니다. 날짜별 추정 접속자 수가 주어질 때, k일 동안 추정 접속자 수의 합이 최대가 되도록 이벤트 기간을 정하려 합니다.
     *
     * 날짜별 추정 접속자 수가 순서대로 담긴 배열 estimates와 출석 이벤트를 진행하는 기간 k가 매개변수로 주어집니다. k일 동안 추정 접속자 수의 합이 최대가 되도록 이벤트 기간을 정했을 때, 그 때의 추정 접속자 수 합을 return 하도록 solution 함수를 완성해주세요.
     *
     */
    public static void main(String[] args) {
//        solution(new int[]{5, 1, 9, 8, 10, 5},3);
        //solution(new int[]{10, 1, 10, 1, 1, 4, 3, 10},6);
        solution(new int[]{10, 8, 10, 8, 10, 10}, 6);
    }

    public static int solution(int[] estimates, int k) {
        if(estimates.length == k) {
            int sum = 0;
            for(int i =0;i<estimates.length;i++){
                sum+= estimates[i];
            }
            return sum;
        }

        int n = estimates.length - k + 1;
        int answer = 0;
        int sum = 0;

        for(int i=0;i<k;i++){
            sum += estimates[i];
        }

        for(int i = 0; i<n-1; i++){
            sum = sum - estimates[i] + estimates[i+k];
            answer = Integer.max(sum,answer);
        }
        System.out.println("answer = " + answer);
        return answer;
    }
}
