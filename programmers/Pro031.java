package programmers;
/*** 치킨 쿠폰 ***/
public class Pro031{
    public int solution(int chicken) {
        int answer = 0;
        int rest = 0;

        while(chicken >= 10){
            answer += (chicken / 10);
            rest += (chicken % 10);
            chicken += (chicken / 10 / 10);
            chicken /= 10;
        }

        int add = chicken + rest;
        while(add >= 10){
            answer += (add / 10);
            rest += (add % 10);
            add /= 10;
        }

        return answer;
    }
}