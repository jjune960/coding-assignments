package programmers._60057;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String s) {
        int answer = s.length();
        String prefix;
        String text;

        for (int i = 1; i <= s.length(); i++) {
            int min = s.length();
            boolean status = false;
            prefix = "";
            for (int j = 0; j < i ; j++) {
                prefix += s.charAt(j);
            }

            Pattern pattern = Pattern.compile("(" + prefix + ")*");
            Matcher matcher = pattern.matcher(s);

            while(matcher.find()) {
                //값 추출
                //prefix의 text가 일치하는 경우 길이 감소하기 (오직 1만 가산)
                // 다른 문자가 온 경우는 길이 존치
                min -= i;
                status = true;
                System.out.println(matcher.group());
            }
            if (status) {
                min++;
            }

            if (answer > min) //최소 길이 갱신
                answer = min;
        }
        return answer;
    }
}