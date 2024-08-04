package programmers;

/*** 문자 정렬하기(2) ***/

import java.util.Arrays;
public class Pro006 {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();

        char[] chArr = my_string.toCharArray();
        Arrays.sort(chArr);

        String answer = new String(chArr);
        return answer;
    }
}

