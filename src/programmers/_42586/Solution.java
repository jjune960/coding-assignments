package programmers._42586;


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        for (int i = 0; i < progresses.length; i++) {
            progresses[i] += speeds[i];
        }

        return answer;
    }
}