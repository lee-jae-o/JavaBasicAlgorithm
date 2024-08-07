package basic;

import java.util.Scanner;

public class Practice006 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("A값 입력: ");
        int A = sc.nextInt();

        System.out.print("B값 입력: ");
        int B = sc.nextInt();

        if (A > B) {
            System.out.print(A + " > " + B);
        } else if (A < B) {
            System.out.print(A + " < " + B);
        } else {
            System.out.print(A + " == " + B);
        }
    }
}
