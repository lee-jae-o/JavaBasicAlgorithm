package basic;

import java.util.Scanner;

public class Practice007 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
