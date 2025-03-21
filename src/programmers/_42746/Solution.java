package programmers._42746;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        int prev_number = 0; // 상위 자릿수의 숫자와 카운트
        int prev_count = 0;

        for (int number : numbers) {
            int tempnum = number; // 임시 변수 생성
            int count = 0;
            while (tempnum / 10 != 0) { // 자릿수 구하기
                tempnum = tempnum / 10;
                count++;
            }
            tempnum = number; // 임시 변수 다시 사용
            for(int i = 0; i < count; i++) { // 카운트한 개수의 바로 직전 까지만 계산하면
                tempnum = tempnum / 10;
            }

//            if ()
        }

        return answer;
    }


}