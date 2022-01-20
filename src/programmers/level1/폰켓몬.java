package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public static void main(String[] args) {
        solution(new int[]{3,1,2,3});
        solution(new int[]{3,3,3,2,2,4});
        solution(new int[]{3,3,3,2,2,2});
    }

    public static int solution(int[] nums) {
        int max = nums.length/2;
        Set set = new HashSet();
        for (int num : nums){
            set.add(num);
        }
        int answer = set.size()>max? max: set.size();
        return answer;
    }
}