package baekjoon._1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        var tokenizer = new StringTokenizer(reader.readLine());
        int count = Integer.parseInt(tokenizer.nextToken());
        double result = 0.0;
        int n[] = new int[count];
        int r[] = new int[count];
        int tempn;
        int tempnminr;

        for(int i = 0; i < count; i++) { // 다리 개수 입력 (
            tokenizer = new StringTokenizer(reader.readLine());
            n[i] = Integer.parseInt(tokenizer.nextToken());
            r[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for(int i = 0; i < count; i++) {
            if (r[i] < 0 || n[i] < r[i]) {
                System.out.println(0);
                continue;
            }
            tempn = n[i];
            tempnminr = n[i] - r[i];

            for(int j = tempn; j > 1; j--) {
                tempn *= n[i];
            }
            for(int k = tempnminr; k > 1; k--) {
                tempnminr *= k;
            }
            System.out.println(tempn/tempnminr);
        }
    }
}