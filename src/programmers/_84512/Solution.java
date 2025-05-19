package programmers._84512;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int solution(String[] list, String word){
        int N = list.length;
        int count = 0;
        for (int i = 0; i < N; ++i) {
            if(word == list[i]) {
                return count;
            }
            count++;
        }
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j) {
                if(word == list[i]+list[j]) {
                    return count;
                }
                count++;
            }
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j)
                for (int k = 0; k < N; ++k) {
                    if(word == list[i]+list[j]+list[k]) {
                        return count;
                    }
                    count++;
                }
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j)
                for (int k = 0; k < N; ++k)
                    for (int l = 0; l < N; ++l) {
                        if(word == list[i]+list[j]+list[k]+list[l]) {
                            return count;
                        }
                        count++;
                    }
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j)
                for (int k = 0; k < N; ++k)
                    for (int l = 0; l < N; ++l)
                        for (int m = 0; m < N; ++m) {
                            if(word == list[i]+list[j]+list[k]+list[l]+list[m]) {
                                return count;
                            }
                            count++;
                        }
        return -1;
    }

    public int solution(String word) {
        int answer = 0;
        String[] list = {"A", "E", "I", "O", "U"};

        answer = solution(list, word);
        return answer;
    }
}