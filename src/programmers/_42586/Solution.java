package programmers._42586;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        ArrayList<Integer> answerList = new ArrayList<>();

        int progressesindex = 0;

        int answercount = 1;
        boolean ansbool = true; // 신규 배포 여부

        while(progressesindex < progresses.length) {
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }

            if(progresses[progressesindex] >= 100) {
                if (ansbool) { // 새로운 배포
                    answerList.add(answercount);
                    ansbool = false;
                    System.out.println(answerList.size() + "a");

                }
                else { // 연속 배포
                    answerList.set(answerList.size() - 1, ++answercount);
                    System.out.println(answerList.size() + "b");
                }
                progressesindex++;
            } else {
                ansbool = true;
                answercount = 1;
            }
        }

        System.out.println(Arrays.toString(progresses));

        answer = answerList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String result = Arrays.toString(sol.solution
                (new int[]{93, 30, 55}, new int[]{1, 30, 5}));

        System.out.println(result);
    }
}