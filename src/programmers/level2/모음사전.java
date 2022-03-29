package programmers.level2;

import java.util.Arrays;

public class 모음사전 {
    public static void main(String[] args) {
        solution("AAAAE");
        solution("AAAE");
        solution("I");
        solution("EIO");
    }

    public static int solution(String word) {
        int answer = 0;
        int[] intArr = new int[] {781, 156, 31, 6, 1};
        Character[] charArr = {'A','E','I','O','U'};
        for(int i=0; i<word.length(); i++) {
            answer += intArr[i] * Arrays.asList(charArr).indexOf(word.charAt(i)) + 1;
        }
        return answer;
    }
}
