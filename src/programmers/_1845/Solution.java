package programmers._1845;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int max = nums.length/2; // 선택 가능한 최대의 폰켓몬 수

        Set<Integer> pokemonset = new HashSet<>(); // 같은 종류를 1개만 남기기 위해 Set 사용

        for (int num : nums) {
            pokemonset.add(num);
        }

        answer = Math.min(max, pokemonset.size()); // 선택 가능한 최대의 폰켓몬 수와 같은 종류의 수 중 작은 수 선택

        return answer;
    }
}