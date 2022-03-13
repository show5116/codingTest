package programmers.gabia;

import java.util.Arrays;

public class five {

    /**
     *
     * 금 한 돈의 값은 매일 변합니다. 금값이 낮을 때 금을 사고, 높을 때 팔면 이익을 낼 수 있습니다. 다음 규칙에 맞게 금을 사고팔아 이익을 남기려고 합니다.
     *
     * 금은 여러 번 사고팔 수 있습니다.
     * 금을 살 때는 한 돈만 살 수 있으며 팔 때도 한 돈만 팔 수 있습니다.
     * 금은 최대 한돈 까지만 가지고 있을 수 있습니다. (즉, 현재 가지고 있는 금을 팔기 전까지는 금을 살 수 없습니다.)
     * 금을 판 날과 다음날에는 금을 사지 않습니다.
     * 이익이 발생하지 않는다면 금을 사고팔지 않아도 됩니다.
     * i번째 요소가 i번째 일의 금 한 돈의 값인 배열 gold_prices가 매개변수로 주어질 때, 금을 사고팔아 얻을 수 있는 최대 이윤을 return 하도록 solution 함수를 완성해 주세요.
     */

    static int answer = 0;

    public static void main(String[] args) {
        solution(new int[]{2, 5, 1, 3, 4});
        solution(new int[]{7, 2, 5, 6, 1, 4, 2, 8});
    }

    public static int solution(int[] gold_prices) {
        dfs(gold_prices,0,gold_prices.length,0,false,false,0,new int[gold_prices.length]);
        System.out.println(answer);
        return answer;
    }

    public static void dfs(int[]arr,int depth,int n,int price,boolean status,boolean sellDay,int point,int[] stat){
        if(depth == n) {
            for(int a : stat){
                System.out.print(a + "\t");
            }
            System.out.println(price);
            answer = Math.max(answer,price);
            return;
        }
        if(sellDay){
            dfs(arr,depth+1,n,price,false,false,0,stat);
        }else {
            int max = 0;
            for(int i = depth+1;i< arr.length;i++){
                max = Math.max(max,arr[i]);
            }
            if(status){
                // 판매할때
                if(arr[depth] >point){
                    int [] newStat = Arrays.copyOf(stat,stat.length);
                    newStat[depth] = 2; // 판매함
                    dfs(arr,depth+1,n,price + arr[depth],false,true,0,newStat);
                }
                // 판매 안할때
                if(arr[depth]<max) dfs(arr,depth+1,n,price,true,false,point,stat);
            }else{
                // 구매할때
                if(arr[depth]<max){
                    int [] newStat = Arrays.copyOf(stat,stat.length);
                    newStat[depth] = 1; // 구매함
                    dfs(arr,depth+1,n,price - arr[depth],true,false,arr[depth],newStat);
                }
                dfs(arr,depth+1,n,price,false,false,0,stat);
            }
        }

    }
}
