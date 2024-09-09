package programmers;
/*** 이진수 더하기 ***/
public class Pro030 {
    public String solution(String bin1, String bin2) {
        String answer = "";
        answer = Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2));
        return answer;
    }
}