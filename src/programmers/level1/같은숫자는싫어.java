package programmers.level1;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        solution(new int[]{1,1,3,3,0,1,1});
        solution(new int[]{4,4,4,3,3});
    }

    public static int[] solution(int []arr) {
        StringBuilder answer = new StringBuilder();
        answer.append(arr[0]);
        for(int item :arr){
            if((answer.charAt(answer.length()-1))!=(item+'0')){
                answer.append(item);
            }
        }
        System.out.println(answer);
        int[] array = new int[answer.length()];
        for(int i=0;i<answer.length();i++){
            array[i] = Integer.parseInt(String.valueOf(answer.charAt(i)));
            System.out.println(array[i]);
        }
        return array;
    }
}
