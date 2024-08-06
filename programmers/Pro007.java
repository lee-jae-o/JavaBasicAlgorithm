package programmers;

/***세균 증식***/
public class Pro007 {

    public int solution(int n, int t) {

        for (int i=1; i<=t; i++) {
            n *= 2;
        }

        return n;
    }
}
