package programmers.gabia;

public class three {
    public static int cnt = 0;

    public static void main(String[] args) {
        solution(new int[]{2,5,3,8,1},3,11);
        //solution(new int[]{1,1,2,2},2,3);
        //solution(new int[]{1,2,3,2},2,2);
    }

    public static int solution(int[] arr, int k, int t) {
        boolean[] visited = new boolean[arr.length];

        for(int r = k; r<=arr.length;r++){
            combination(arr,visited,0,arr.length,r,t);
        }

        System.out.println(cnt);
        return cnt;
    }

    public static void combination(int[] arr,boolean[] visited,int start, int n, int r,int t){
        if (r == 0) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    sum += arr[i];
                }
            }
            if(sum <= t) cnt++;
            return ;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1,t);
            visited[i] = false;
        }
    }

}
