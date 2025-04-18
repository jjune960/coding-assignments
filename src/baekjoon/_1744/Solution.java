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
            } else if (num >= 2){
                overtwoqueue.addFirst(num);
            } else { // 0 or 1
                sum += num; // 무조건 더하는 것이 유리하므로 sum에 바로 더함
            }
        }

        int num1;
        int num2;

//        System.out.println("음수");
//        while(minusqueue.size() > 0) {
//            System.out.println(minusqueue.removeFirst());
//        }
//
//        System.out.println("2 이상");
//
//        while(overtwoqueue.size() > 0) {
//            System.out.println(overtwoqueue.removeLast());
//        }

        while(minusqueue.size() > 0) { // 음수
            num1 = minusqueue.removeFirst();
            if (minusqueue.size() == 0){
                sum += num1;
            }
            else {
                num2 = minusqueue.removeFirst();
                sum += num1 * num2;
            }
        }

        while(overtwoqueue.size() > 0) { // 2 이상
            num1 = overtwoqueue.removeLast();
            if (overtwoqueue.size() == 0){
                sum += num1;
            }
            else {
                num2 = overtwoqueue.removeLast();
                sum += num1 * num2;
            }
        }

        System.out.println(sum);
    }
}