package programmers._42586;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        for (int i = 0; i < progresses.length; i++) {
            progresses[i] += speeds[i];
        }

        if(progresses[0] >= 100) {
            System.out.println("over 100%");
        }

        return progresses;
        //return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String result = Arrays.toString(sol.solution(new int[]{99, 30, 55}, new int[]{1, 30, 5}));

        System.out.println(result);
    }
}