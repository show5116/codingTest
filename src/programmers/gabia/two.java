package programmers.gabia;

public class two {

    /**
     * 로봇이 이동할 수 있는 레일이 설치된 도로가 있습니다. 도로는 일정 크기의 블록으로 나뉘어 있으며, 각 블록에는 '>' 또는 '<' 기호가 표시되어있습니다. 로봇은 블록에 표시된 기호를 인식하여 이동합니다. 만약 '>'가 표시되어있다면 로봇은 1칸 오른쪽으로, '<'가 표시되어있다면 로봇은 1칸 왼쪽으로 이동합니다. 로봇은 도로의 아무 블록에서나 출발할 수 있으며, 로봇의 최종 목표는 도로를 빠져나오는 것입니다. 이때, 로봇이 도로를 빠져나올 수 있는 출발점의 개수를 구하는 것이 목표입니다.
     *
     * 예를 들어, 도로가 <<<>< 라면, 1번째 블록, 2번째 블록, 3번째 블록에 로봇을 두면 왼쪽 밖으로 빠져나올 수 있지만, 4번째 블록과 5번째 블록에 로봇을 두면 어느 방향으로도 밖으로 빠져나올 수 없으므로 빠져나올 수 있는 출발점은 1번째 블록, 2번째 블록, 3번째 블록이므로 출발점의 개수는 3개가 됩니다. 도로의 블록에 표시된 기호가 문자열 P로 주어질 때, 도로를 빠져나올 수 있는 출발점의 개수를 return 하는 solution 함수를 완성해 주세요.
     *
     */

    public static void main(String[] args) {
        //solution("<<<><");
        //solution("<<<>>");
        //solution("<<><<<>><>>");
        solution("<<<<>>");
    }

    public static int solution(String p) {
        int cnt = 0;
        for(int i = 0; i<p.length();i++){
            if(p.charAt(i) == '<') cnt++;
            else break;
        }

        for(int i = p.length()-1; i>= 0; i--){
            if(p.charAt(i) == '>') cnt++;
            else break;
        }

        System.out.println(cnt);
        return cnt;
    }
}
