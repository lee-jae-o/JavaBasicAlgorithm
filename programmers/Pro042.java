package programmers;
/*** 숨어있는 숫자의 덧셈(2) ***/
public class Pro042 {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for (String s : str) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }

        return answer;
    }
}