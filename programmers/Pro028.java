package programmers;
/*** k의 개수 ***/
public class Pro028{
    public int solution(int i, int j, int k) {
        int answer = 0;

        String check = "";

        for (int l = i; l <= j; l++) {

            check = ""+l;

            for (int m = 0; m < check.length(); m++) {

                if(k == Integer.parseInt(String.valueOf(check.charAt(m)))){
                    answer++;
                }
            }
        }

        return answer;
    }
}
