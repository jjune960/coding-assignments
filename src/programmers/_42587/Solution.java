package programmers._42587;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Deque<Integer> priortyqueue = new ArrayDeque<>();

        priortyqueue.addAll(Arrays.stream(priorities).boxed().toList());

        System.out.println(priortyqueue);

        int index = 0; // 인덱스 기록용
        int max = priorities.length; // 배열 크기(인덱스 파악용)
        int prepriorty = 0; // 이전 큐의 우선순위

        while (true) {

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.solution(new int[]{2, 1, 3, 2}, 2);
        System.out.println(result);
    }
}

