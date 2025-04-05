package programmers._49993;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = -1;
        String skill_regex = "";
        //String[] skill = new String[skill.length()];

        for(int i = 0; i < skill.length() - 1; i++) // 정규식 text 제작
            skill_regex = skill_regex + skill.charAt(i) + ".*";

        skill_regex = skill_regex + skill.charAt(skill.length() - 1); // 마지막 text 처리

        for(int i = 0; i < skill_trees.length; i++) {
            Pattern pattern = Pattern.compile(skill_regex); // 정규식 계산
            Matcher matcher = pattern.matcher(skill_trees[i]);
            if (matcher.find())
                answer = i + 1; // index + 1 반환
        }
        return answer;
    }
}