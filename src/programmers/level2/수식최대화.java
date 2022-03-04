package programmers.level2;

import javax.jws.Oneway;
import java.util.*;

public class 수식최대화 {
    public static void main(String[] args) {
        solution("100-200*300-500+20");
        //solution("50*6-3*2");
    }

    public static long solution(String expression) {
        List<Long> numList = new ArrayList<>();
        List<Character> operList = new ArrayList<>();
        Set<Character> operSet = new HashSet<>();

        long temp = 0;
        for (int i=0;i<expression.length();i++){
            if(Character.isDigit(expression.charAt(i))){
                temp = temp*10 + Character.getNumericValue(expression.charAt(i));
            }else {
                numList.add(temp);
                temp = 0;
                operList.add(expression.charAt(i));
                operSet.add(expression.charAt(i));
            }
        }
        numList.add(temp);

        Object[] operArr = operSet.toArray();
        List<Object[]> orderList = new ArrayList<>();
        getOrder(operArr,0,orderList);

        long answer = 0;
        for(Object[] order: orderList){
            answer = getAnswer(order, new ArrayList<>(numList),operList);
        }

        return answer;
    }

    public static void getOrder(Object[] operArr, int idx,List<Object[]> orderList){
        if(idx == operArr.length-1){
            orderList.add(Arrays.copyOf(operArr,operArr.length));
            return;
        }

        for(int i = idx ; i< operArr.length;i++){
            swap(operArr,idx,i);
            getOrder(operArr,idx+1,orderList);
            swap(operArr,idx,i);
        }
    }

    public static void swap(Object[] operArr,int a, int b){
        Object temp = operArr[a];
        operArr[a] = operArr[b];
        operArr[b] = temp;
    }

    public static long calculate(long a, long b, char oper){
        if(oper=='*'){
            return a*b;
        }else if(oper=='-'){
            return a-b;
        }else{
            return a+b;
        }
    }

    public static long getAnswer(Object[] order,List<Long> numList,List<Character> operList){
        long answer = 0;
        for(Object oper : order){
            while (true){
                if(operList.indexOf(oper) == -1){
                    break;
                }

            }
        }

        return Math.abs(answer);
    }
}
