package programmers._42746;

import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        String[] numStrs = new String[numbers.length]; // 문자열 변환하기 위한 배열
        for (int i = 0; i < numbers.length; i++) {
            numStrs[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numStrs, new Comparator<String>() { // 내림차순 정렬
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        });



        return answer;
    }
}
