package programmers._42587;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Deque<Integer> processDeque = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            processDeque.offer(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.solution(new int[]{2, 1, 3, 2}, 2);
        System.out.println(result);
    }
}

