package programmers._42748;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // answer 크기를 command 크기로
        int count = 0;

        for(int[] command : commands) {
            int i = command[0] - 1; // 1시작 index를 0부터 시작하게 변경
            int j = command[1]; // j는 마지막 인덱스에서 포함 안하므로 그대로 사용
            int k = command[2] - 1;

            int[] temp = new int[j - i]; //temp 크기는 숫자를 담을(j-i) 정도만

            for (int index = i; index < j; index++) {
                temp[index - i] = array[index];
            }
            Arrays.sort(temp);

            //System.out.println(Arrays.toString(temp));

            answer[count] = temp[k];

            count++;
        }

        return answer;
    }

    public static void main(String[] args) { // 테스트용 코드
        Solution sol = new Solution();
        int[] result = sol.solution(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}
        );
        System.out.println(Arrays.toString(result));
    }
}