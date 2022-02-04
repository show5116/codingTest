package programmers.level2;

public class 조이스틱 {
    public static void main(String[] args) {
        solution("JEROEN");
        solution("JAN");
    }

    public static int solution(String name) {
        int answer = 0;
        char[] chars = name.toCharArray();
        for(char spelling : chars){
            answer += spelling <'M' ? spelling - 'A': 'Z' - spelling + 1;
            if(spelling != 'A') answer++;
        }
        answer--;
        System.out.println(answer);
        return answer;
    }
}