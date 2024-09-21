package programmers;
/*** 삼각형의 완성조건 ***/
public class Pro040 {
    public int solution(int[] sides) {
        int bigValue = Math.max(sides[0], sides[1]);
        int smallValue = Math.min(sides[0], sides[1]);

        int lowLimit = bigValue - smallValue;
        int highLimit = bigValue + smallValue;

        return highLimit - lowLimit - 1;
    }
}