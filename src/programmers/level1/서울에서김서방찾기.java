package programmers.level1;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        solution(new String[]{"Jane","Kim"});
    }

    public static String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                answer.append("김서방은 ");
                answer.append(i);
                answer.append("에 있다");
                break;
            }
        }

        return answer.toString();
    }
}
