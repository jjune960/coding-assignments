package programmers._42747;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        citations = Arrays.stream(citations).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i).toArray();

        return answer;
    }
}