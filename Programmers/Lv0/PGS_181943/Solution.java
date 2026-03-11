package Lv0.PGS_181943;

public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String front = my_string.substring(0, s);
        String back = my_string.substring(s + overwrite_string.length());

        StringBuilder sb = new StringBuilder();
        sb.append(front);
        sb.append(overwrite_string);
        sb.append(back);
        String answer = sb.toString();

        return answer;
    }
}
