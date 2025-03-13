package programmers._1845;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int last = nums.length/2;

        int[] count = new int[last];

        //count[] = 0;

        for (int n = 0; n < last; n++) {
            if (n != 0)
                count[n] = count[n-1] + 1;
            else
                count[n] = 0;
            for (; count[n] < last - n; count[n]++) {

            }
        }


//        for (count[0] = 0; count[0] < last; count[0]++) {
//            for (int n = 1; n < last; n++) {
//                for (count[n] = count[n-1] + 1; count[n] < nums.length - 1; count[n]++) {
//
//                }
//            }
//
//        }

        return answer;
    }
}