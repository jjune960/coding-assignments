package programmers._42746;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        String[] numStrs = new String[numbers.length]; // 문자열 변환하기 위한 배열
        for (int i = 0; i < numbers.length; i++) {
            numStrs[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numStrs,
                new Comparator<String>() { // 내림차순 정렬
                    public int compare(String s1, String s2) {
                        return (s2 + s1).compareTo(s1 + s2);
                    }
                });

        if (numStrs[0].equals("0")) { // 가장 큰 숫자가 0인 경우
            answer = "0";
        } else {
            for (String num : numStrs) { // 문자열 이어 붙이기
                answer += num;
            }
        }

        return answer;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution sol = new Solution();
        String result = sol.solution(new int[]{3, 30, 34, 5, 9});
        System.out.println(result);
    }
}

