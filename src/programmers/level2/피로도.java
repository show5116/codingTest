package programmers.level2;

public class 피로도 {
    public static int answer;
    public static boolean[] visit;

    public static void main(String[] args) {
        solution(80,new int[][]{{80,20},{50,40},{30,10}});
    }

    public static int solution(int k, int[][] dungeons) {
        answer = 0;
        visit = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }

    public static void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }

        answer = Math.max(answer, depth);
    }
}
