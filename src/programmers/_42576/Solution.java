package programmers._42576;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> professor = new HashMap<>();
        for(String p : participant) { // 초기 값 설정 및 동명이인 카운트
            professor.put(p,professor.getOrDefault(p, 0) + 1);
        }

        for(String c : completion) { // 완주 카운트
            professor.put(c, professor.get(c)-1);
        }

        for(String s : professor.keySet()) { //key를 모두 불러와 미완주자 걸러내기
            if(professor.get(s)!=0) {
                answer = s;
            }
        }

        return answer;
    }
}