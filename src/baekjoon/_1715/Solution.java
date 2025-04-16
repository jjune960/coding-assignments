package baekjoon._1715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> cards = new PriorityQueue<>();
        int sum = 0;

        var reader = new BufferedReader(new InputStreamReader(System.in));
        var tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        //int[] M = new int[N];
        for(int i = 0; i < N; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            cards.add(Integer.parseInt(tokenizer.nextToken()));
        }

        for(int i = 0; i < N; i++) {
            int now = cards.remove();
            if (i == 1)
                sum = (sum + now);
            else
                sum += (sum + now);
        }

        System.out.println(sum);
    }
}