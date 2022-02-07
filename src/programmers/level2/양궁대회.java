package programmers.level2;

import java.util.*;

public class 양궁대회 {
    public static void main(String[] args) {
        solution(5,new int[]{2,1,1,1,0,0,0,0,0,0,0});
        solution(1,new int[]{1,0,0,0,0,0,0,0,0,0,0});
        solution(9,new int[]{0,0,1,2,0,1,1,1,1,1,1});
        solution(10,new int[]{0,0,0,0,0,0,0,0,3,4,3});
    }

    public static int[] solution(int n, int[] info) {
        int[] answer = new int[11];
        List<Target> list = new ArrayList<>();
        for(int i=0;i<info.length;i++){
            if(info[i]>0) list.add(new Target(10-i,info[i],(double)(10-i)*2/(info[i]+1)));
            else list.add(new Target(10-i,info[i],(double)(10-i)));
        }
        Collections.sort(list);
        int apach = 0;
        int lion = 0;
        int arrows = n;
        for(Target target : list){
            if(arrows < target.count+1){
                if(target.count > 0) apach += target.point;
                continue;
            }else{
                arrows -= target.count+1;
                answer[10-target.point] = target.count+1;
                lion += target.point;
            }
        }
        if(arrows!=0) answer[10] = arrows;
        for(int i=1;i<info.length;i++){
            int[] newAnswer = new int[11];
            int newApach = 0;
            int newLion = 0;
            int newArrow = n;
            for(int j=0;j<list.size();j++){
                if(j<=i || newArrow < list.get(j).count+1){
                    if(list.get(j).count > 0) newApach += list.get(j).point;
                }else{
                    newArrow -= list.get(j).count+1;
                    newAnswer[10-list.get(j).point] = list.get(j).count+1;
                    newLion += list.get(j).point;
                }
            }
            if(newArrow!=0) newAnswer[10] = newArrow;
            for(int item : newAnswer){
                System.out.print(item);
            }
            System.out.print(" " + (newLion-newApach));
            System.out.println();
            if(newLion-newApach > lion - apach){
                lion = newLion;
                apach = newApach;
                answer = newAnswer;
            }else if(newLion-newApach == lion - apach){
                for(int a=newAnswer.length-1;a>=0;a--){
                    if(newAnswer[a] > answer[a]){
                        lion = newLion;
                        apach = newApach;
                        answer = newAnswer;
                        break;
                    }else if(newAnswer[a] < answer[a] && answer[a]!=0){
                        break;
                    }
                }
            }
        }

        if(lion <= apach) return new int[]{-1};
        for(int item : answer){
            System.out.print(item);
        }
        System.out.print(" " + (lion-apach));
        System.out.println();
        System.out.println();
        return answer;
    }

    public static class Target implements Comparable<Target>{
        int point;
        int count;
        double expect;

        public Target(int point,int count ,double expect){
            this.point = point;
            this.count = count;
            this.expect = expect;
        }

        @Override
        public int compareTo(Target o) {
            if(this.expect == o.expect){
                if(this.point> o.point) return -1;
                return 1;
            }
            if(this.expect > o.expect) return -1;
            return 1;
        }

        @Override
        public String toString() {
            return "Target{" +
                    "point=" + point +
                    ", count=" + count +
                    ", expect=" + expect +
                    '}';
        }
    }
}
