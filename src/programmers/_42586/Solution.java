package programmers._42586;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> answerList = new ArrayList<>();

        //int answerindex = 0;

        for (int i = 0; i < progresses.length; i++) {
            progresses[i] += speeds[i];
        }

        if(progresses[0] >= 100) {
            answerList.add(1);
        }

        System.out.println(Arrays.toString(progresses));

        answer = answerList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String result = Arrays.toString(sol.solution
                (new int[]{99, 30, 55}, new int[]{1, 30, 5}));

        System.out.println(result);
    }
}