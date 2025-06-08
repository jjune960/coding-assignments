package programmers._12977;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = -1;

        answer = DFS(nums, 0, new ArrayList<>(), 3);

        return answer;
    }

    int DFS(int[] ar, int index, List<Integer> selected, int r){
        if (selected.size() == r) {
            int sum = 0;

            for(int n : selected) {
                sum += n;
            }

            if (isPrime(sum)) return 1;

            return 0;
        }
        if (selected.size() + ar.length - index < r) return 0;

        // 포함하는 경우
        selected.add(ar[index]);
        int count1 = DFS(ar, index + 1, selected, r);
        selected.remove(selected.size() - 1);

        //  포함하지 않는 경우
        int count2 = DFS(ar, index + 1, selected, r);
        return count1 + count2;
    }
    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}