package programmers.gabia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class six {

    static List<Point> list = new ArrayList<>();

    public static void main(String[] args) {
        solution(new int[][]{{3,4,5},{2,3,4},{1,2,3}},1);
    }

    public static int solution(int[][] grid, int K) {
        for(int x = 0; x <= grid.length-K;x++){
            for(int y = 0; y<=grid.length-K;y++){
                list.add(new Point(x,y,grid,K));
            }
        }
        Collections.sort(list);
        int answer = list.get(0).value;
        for(int i = 1;i<list.size();i++){
            if(Math.abs(list.get(0).x - list.get(i).x) >= K ||Math.abs(list.get(0).y - list.get(i).y) >= K){
                System.out.println("야이");
                answer += list.get(i).value;
                break;
            }
        }
        return answer;
    }

    static class Point implements Comparable<Point> {
        int x;
        int y;
        int value;

        public Point(int x, int y,int[][] grid,int k){
            this.x = x;
            this.y = y;
            int value = 0;
            for(int i=x; i<x+k;i++){
                for(int j=y; j<y+k;j++){
                    value += grid[i][j];
                }
            }
            this.value = value;
        }

        @Override
        public int compareTo(Point o) {
            if(this.value > o.value) return -1;
            else return 1;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", value=" + value +
                    '}';
        }


    }
}
