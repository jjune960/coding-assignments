package baekjoon._1744;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> sequences = new PriorityQueue<>();
        int sum = 0;
        int minus = 0;
        int overtwo = 0;
        //int[] minusary;
        ArrayDeque<Integer> minusqueue = new ArrayDeque<>();
        ArrayDeque<Integer> overtwoqueue = new ArrayDeque<>();

        var reader = new BufferedReader(new InputStreamReader(System.in));
        var tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());

        for(int i = 0; i < N; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            sequences.add(Integer.parseInt(tokenizer.nextToken()));
        }

        for (int i = 0; i < N; i++) { // sequences 숫자 구분
            int num = sequences.remove();
            if(num < 0) {
                minusqueue.addFirst(num);
            } else if (num > 2){
                overtwoqueue.addFirst(num);
            } else { // 0 or 1
                sum += num; // 무조건 더하는 것이 유리하므로 sum에 바로 더함
            }
        }

        if(minusqueue.size() != 0){ // 음수인 경우
            int num1;
            int num2;
            int size = minusqueue.size();

            for(int i = 0; i < size; i=i+2) {
                num1 = minusqueue.removeLast();
                num2 = minusqueue.removeLast();

                sum += num1 + num2;
            }

            if(minusqueue.size()/2 == 1) {
                sum += minusqueue.removeLast();
            }
        }

        if(overtwoqueue.size() != 0){ // 2이상(양수)인 경우
            int num1;
            int num2;
            int size = overtwoqueue.size();

            for(int i = 0; i < size; i=i+2) {
                num1 = overtwoqueue.removeFirst();
                num2 = overtwoqueue.removeFirst();

                sum += num1 + num2;
            }

            if(overtwoqueue.size()/2 == 1) {
                sum += overtwoqueue.removeFirst();
            }
        }

        System.out.println(sum);
    }
}
