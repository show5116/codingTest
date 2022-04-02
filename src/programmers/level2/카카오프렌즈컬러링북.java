package programmers.level2;

public class 카카오프렌즈컬러링북 {
    public static int maxSizeOfOneArea;
    public static int cnt;

    public static void main(String[] args) {
        //solution(6,4,new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}});
        solution(13,16 ,
                new int[][]{
                        {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                        {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
                        {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                        {0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
                        {0,1,1,1,1,2,1,1,1,1,2,1,1,1,1,0},
                        {0,1,1,1,2,1,2,1,1,2,1,2,1,1,1,0},
                        {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                        {0,1,3,3,3,1,1,1,1,1,1,3,3,3,1,0},
                        {0,1,1,1,1,1,2,1,1,2,1,1,1,1,1,0},
                        {0,0,1,1,1,1,1,2,2,1,1,1,1,1,0,0},
                        {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                        {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0}});
    }

    public static int[] solution(int m, int n, int[][] picture) {
        maxSizeOfOneArea = 0;
        int numberOfArea = 0;
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(picture[i][j] != 0) {
                    cnt = 0;
                    numberOfArea++;
                    getArea(i,j,picture,picture[i][j]);
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        System.out.println(answer[0]);
        System.out.println(answer[1]);

        return answer;
    }

    public static void getArea (int x, int y, int[][] picture,int num){
        picture[x][y] = 0;
        cnt++;

        if(x+1< picture.length && picture[x+1][y] == num){
            getArea(x+1,y,picture,num);
        }

        if(x-1>= 0 && picture[x-1][y] == num){
            getArea(x-1,y,picture,num);
        }

        if(y+1< picture[0].length && picture[x][y+1] == num){
            getArea(x,y+1,picture,num);
        }

        if(y-1>=0 && picture[x][y-1] == num){
            getArea(x,y-1,picture,num);
        }

        maxSizeOfOneArea = Integer.max(maxSizeOfOneArea,cnt);

    }
}
