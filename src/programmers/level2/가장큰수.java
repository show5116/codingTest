package programmers.level2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 가장큰수 {
    public static void main(String[] args) {
        //solution(new int[]{1,11,101});
        solution(new int[]{3,30,34,5,9});
    }

    public static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new MyComparator());
        for(int number : numbers){
            queue.add(number);
        }
        int size = queue.size();
        for(int i=0; i<size;i++){
            sb.append(queue.poll()+" ");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            int oo1 = o1;
            int oo2 = o2;
            while (true){
                if(o1/(int)Math.pow(10,(o1+"").length()-1) > o2/(int)Math.pow(10,(o2+"").length()-1)){
                    return -1;
                }else if(o1/(int)Math.pow(10,(o1+"").length()-1) < o2/(int)Math.pow(10,(o2+"").length()-1)){
                    return 1;
                }
                if(o1<10 || o2<10){
                    if(oo1 > oo2) return 1;
                    else return -1;
                }else{
                    o1 %= (int)Math.pow(10,(o1+"").length()-1);
                    o2 %= (int)Math.pow(10,(o2+"").length()-1);
                }
            }
        }
    }
}
