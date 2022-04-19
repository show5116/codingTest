package backjun.Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z {
    private static int r;
    private static int c;
    private static int N;
    private static int count;
    private static int[] dx = {0, 1, 0, 1};
    private static int[] dy = {0, 0, 1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        N = Integer.parseInt(tokenizer.nextToken());
        r = Integer.parseInt(tokenizer.nextToken());
        c = Integer.parseInt(tokenizer.nextToken());
        count = 0;

        int x = 0;
        int y = 0;

        int n = 1;
        for(int i=0; i<n; i++) {
            n *= 2;
        }

        while (n > 0) {
            n /= 2;

            if (r < x+n && c < y+n) {
                count += n * n * 0;
            }
            else if (r < x+n) {
                count += n * n * 1;
                y += n;
            }
            else if (c < y+n) {
                count += n * n * 2;
                x += n;
            }
            else {
                count += n * n * 3;
                x += n;
                y += n;
            }

            if(n == 1) {
                System.out.println(count);
                break;
            }
        }
    }


}
