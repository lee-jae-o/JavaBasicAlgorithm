package programmers;

import java.util.Scanner;

/*** 자릿수 더하기 ***/
public class Pro011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        System.out.println("합산 결과: " + answer);
    }
}
