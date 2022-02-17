package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 크레인인형뽑기 {
    public static void main(String[] args) {
        solution(new int[][]{ {0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1},{4, 2, 4, 4, 2},{3, 5, 1, 3, 1}},
                new int[]{1, 5, 3, 5, 1, 2, 1, 4});
    }

    public static int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for(int num : moves){
            int index = num - 1;
            for(int i = 0; i < board.length; i++){
                if(board[i][index] != 0){
                    if(!stack.isEmpty() && (int)stack.peek() == board[i][index]){
                        list.add(stack.pop());
                        list.add(board[i][index]);
                    } else {
                        stack.push(board[i][index]);
                    }
                    board[i][index] = 0;
                    break;
                }
            }
        }
        return list.size();
    }
}
