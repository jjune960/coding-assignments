package programmers._42576;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        List<String> participantArray = new ArrayList<>();
        List<String> completionArray = new ArrayList<>();

        participantArray.addAll(Arrays.asList(participant));
        completionArray.addAll(Arrays.asList(completion));

        participantArray.removeAll(completionArray);

        answer = participantArray.toString();

        return answer;
    }
}