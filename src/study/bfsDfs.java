package study;

import java.util.LinkedList;
import java.util.Queue;

public class bfsDfs {

    public static boolean[] visit;
    public static int[][] map;
    public static int n;

    public static void main(String[] args) {
        n = 3;
        visit = new boolean[n];
        map = new int[n][n];
        dfs(0);
        bfs(0);
    }

    // dfs, 재귀, 인접 행렬, i 정점부터 시작한다.
    public static void dfs(int i) {
        visit[i] = true;
        System.out.print(i + " ");
        for(int j=1; j<n+1; j++) {
            if(map[i][j] == 1 && visit[j] == false) {
                dfs(j);
            }
        }
    }

    // bfs, q사용, 인접행렬, i 정점부터 시작한다.
    public static void bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visit[i] = true;
        while(!q.isEmpty()) {
            int temp = q.poll();
            System.out.print(temp + " ");
            for(int j=1; j<n+1; j++) {
                if(map[temp][j] == 1 && visit[j] == false) {
                    q.offer(j);
                    visit[j] = true;
                }
            }
        }
    }

}
