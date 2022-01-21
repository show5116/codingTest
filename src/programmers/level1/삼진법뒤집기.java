package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        solution(45);
        solution(125);
    }
    public static int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%3);
            n = n/3;
        }
        for(int i=0; i<list.size();i++){
            answer += list.get(i)*Math.pow(3,list.size()-i-1);
        }
        return answer;
    }
}
