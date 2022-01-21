package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 실패율 {
    public static void main(String[] args) {
        solution(5,new int[]{2,1,2,6,2,4,3,3});
        solution(4,new int[]{4,4,4,4,4});
    }

    public static int[] solution(int N, int[] stages) {
        List<Ratio> ratioList = new ArrayList<>();

        for(int i=1;i<=N;i++){
            Ratio ratio = new Ratio(i);
            for(int item : stages){
                if(item == i){
                    ratio.setNow(ratio.getNow()+1);
                    ratio.setNext(ratio.getNext()+1);
                    continue;
                }
                if(item >i){
                    ratio.setNext(ratio.getNext()+1);
                }
            }
            ratioList.add(ratio);
        }
        Collections.sort(ratioList);
        int[] answer = new int[N];
        for(int i=0;i< ratioList.size();i++){
            answer[i] = ratioList.get(i).getStage();
        }
        return answer;
    }

}

class Ratio implements Comparable<Ratio> {
    private int stage;
    private int next;
    private int now;

    public Ratio(int stage) {
        this.stage = stage;
        this.next = 0;
        this.now = 0;
    }

    public int getStage(){
        return stage;
    }

    public int getNext() {
        return next;
    }

    public int getNow() {
        return now;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public void setNow(int now) {
        this.now = now;
    }

    @Override
    public int compareTo(Ratio o) {
        if(this.next == 0 && o.next ==0){
            if(this.stage > o.stage){
                return 1;
            }
        }else if(this.next==0){
            return 1;
        }else if(o.next == 0){
            return -1;
        }
        if((float)this.now/this.next > (float)o.now/o.next){
            return -1;
        }else if((float)this.now/this.next == (float)o.now/o.next){
            if(this.stage > o.stage){
                return 1;
            }
            return -1;
        }
        return 1;
    }
}