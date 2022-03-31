package programmers.level2;

public class 행렬의곱셈 {
    public static void main(String[] args) {
        solution(new int[][]{{1,4},{3,2},{4,1}},new int[][]{{3,3},{3,3}});
        solution(new int[][]{{2,3,2},{4,2,4},{3,1,4}},new int[][]{{5,4,3},{2,4,1},{3,1,1}});
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0;i<answer.length;i++){
            for(int j = 0;j<answer[i].length;j++){
                for(int k =0;k<arr1[i].length;k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
