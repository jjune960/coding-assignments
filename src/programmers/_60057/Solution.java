package programmers._60057;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String s) {
        int answer = s.length();

        if (s.length() == 1) return 1; // 문자열이 1자리이면 1 반환

        for (int step = 1; step <= s.length() / 2; step++) { // 전체 문자열 압축의 경우 최대 절반 단위만 의미 있음
            StringBuilder compressed = new StringBuilder();
            int pos = 0;

            // 문자열 전체를 탐색하면서 압축 수행
            while (pos < s.length()) {
                // 현재 단위 문자열(prefix)
                String currentPrefix;
                if (pos + step <= s.length()) {
                    currentPrefix = s.substring(pos, pos + step);
                } else {
                    // 남은 길이가 step보다 작으면 그대로 사용
                    currentPrefix = s.substring(pos);
                }

                // 현재 위치에서 시작해서 currentPrefix가 몇 번 연속 나오는지 확인
                // Pattern.quote()를 사용하여 특수문자가 있을 경우 문제를 방지
                Pattern pattern = Pattern.compile("^(" + Pattern.quote(currentPrefix) + ")+");
                Matcher matcher = pattern.matcher(s.substring(pos));

                int repeat = 1; // 기본 반복 횟수
                if (matcher.find()) {
                    String matched = matcher.group();
                    // 현재 접두어의 반복 횟수
                    repeat = matched.length() / currentPrefix.length();
                }

                // 반복 횟수가 2 이상이면 숫자와 단위를 추가, 아니면 단위 문자열만 추가
                if (repeat > 1) {
                    compressed.append(repeat).append(currentPrefix);
                } else {
                    compressed.append(currentPrefix);
                }

                // 반복한 만큼의 길이만큼 pos 이동
                pos += currentPrefix.length() * repeat;
            }

            // 모든 단위에 대해 압축 문자열의 최소 길이를 갱신
            answer = Math.min(answer, compressed.length());
        }
        return answer;
    }
}