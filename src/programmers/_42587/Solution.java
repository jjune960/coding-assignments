package programmers._42587;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Deque<Integer> processDeque = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            processDeque.addLast(i);
        }

        while (!processDeque.isEmpty()) {
            int current = processDeque.removeFirst();
            boolean isHighest = true;

            // 남은 문서들 중 현재 문서보다 우선순위가 높은 것이 있는지 확인
            for (int index : processDeque) {
                if (priorities[index] > priorities[current]) {
                    isHighest = false;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.solution(new int[]{2, 1, 3, 2}, 2);
        System.out.println(result);
    }
}

