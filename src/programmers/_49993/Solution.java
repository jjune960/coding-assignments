package programmers._49993;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String tree : skill_trees) {
            StringBuilder filtered = new StringBuilder();

            // 스킬트리에서 skill 문자열에 있는 문자만 골라냄
            for (int i = 0; i < tree.length(); i++) {
                char c = tree.charAt(i);
                if (skill.indexOf(c) != -1) {
                    filtered.append(c);
                }
            }

            // 필터링된 문자열이 skill의 접두사인지 확인
            if (skill.startsWith(filtered.toString())) {
                answer++;
            }
        }

        return answer;
    }
}