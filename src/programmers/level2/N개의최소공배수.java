package programmers.level2;

public class N개의최소공배수 {
    public static void main(String[] args) {
        solution(new int[]{2,6,8,14});
        solution(new int[]{1,2,3});
    }

    public static int solution(int[] arr) {
        int answer = arr[0];

        for(int i = 1;i<arr.length;i++){
            int gcd = getGcd(answer,arr[i]);
            answer = answer * arr[i] / gcd;
        }

        return answer;
    }

    public static int getGcd(int a, int b){
        int x = Math.max(a,b);
        int y = Math.min(a,b);

        while(x % y != 0){
            int r = x % y;
            x = y;
            y = r;
        }

        return y;
    }
}
