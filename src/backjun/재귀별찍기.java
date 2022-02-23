package backjun;

import java.util.Arrays;
import java.util.Scanner;

public class 재귀별찍기 {

    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        array = new char[n][n];
        for(int i = 0; i<n; i++){
            Arrays.fill(array[i],' ');
        }
        solution(n,0,0);
        for(int i=0; i<n; i++){
            System.out.println(array[i]);
        }
    }

    public static void solution(int n, int x, int y){
        if(n==1){
            array[x][y] = '*';
            return;
        }
        int value = n/3;

        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                if(i==1 && j==1) continue;
                else solution(value,x+(value*i),y+(value*j));
            }
        }
    }
}
