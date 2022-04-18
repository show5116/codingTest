package backjun.Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 물병 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N=0, K=0;
        try{
            String input = reader.readLine();
            N = Integer.parseInt(input.split(" ")[0]);
            K = Integer.parseInt(input.split(" ")[1]);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int answer = 0;

        while (true){
            int cnt = 0;
            String binary = Integer.toBinaryString(N+answer);
            for(int i = 0; i< binary.length();i++){
                if(binary.charAt(i) == '1') cnt++;
            }
            if(cnt<=K) break;
            answer++;
        }

        System.out.println(answer);
    }
}
