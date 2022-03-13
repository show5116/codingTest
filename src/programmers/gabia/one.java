package programmers.gabia;

public class one {

    /**
     *
     * 3개의 숫자 mod1, mod2, max_range가 주어집니다. 1 이상 max_range 이하의 자연수 중에서 mod1로 나누어떨어지지만, mod2로 나누어떨어지지 않는 수의 개수를 return 하도록 solution 함수를 완성하세요.
     */
    public static void main(String[] args) {
        solution(4,3,20);
        solution(3,4,20);
    }

    public static int solution(int mod1, int mod2, int max_range) {
        int lcm = mod1 * mod2 / gcd(mod1,mod2);

        return max_range/mod1 - max_range/lcm;
    }

    public static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }

        return a;
    }
}
