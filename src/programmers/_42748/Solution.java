package programmers._42748;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.solution(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}
        );
        System.out.println(Arrays.toString(result));
    }
}