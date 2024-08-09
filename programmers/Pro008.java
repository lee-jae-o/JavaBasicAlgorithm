package programmers;

import java.util.Scanner;

/*** 제곱수 판별하기 ***/
class Pro008 {
    public static void main(String[] args) {

        Scanner sqrt = new Scanner(System.in);

        System.out.print("판별할 숫자를 입력해주세요: ");
        int n = sqrt.nextInt();

        if (Math.sqrt(n) % 1 == 0) {
            System.out.print("제곱수 입니다.");
        } else {
            System.out.print("제곱수가 아닙니다.");
        }
    }
}
