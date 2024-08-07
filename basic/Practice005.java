package basic;

import java.util.Scanner;

public class Practice005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("A값 입력: ");
        int A = sc.nextInt();

        System.out.print("B값 입력: ");
        int B = sc.nextInt();

        System.out.print("C값 입력: ");
        int C = sc.nextInt();

        System.out.println("(A+B)%C = " + (A+B)%C);
        System.out.println("((A%C) + (B%C))%C = " + ((A%C) + (B%C))%C);
        System.out.println("(A*B)%C = " + (A*B)%C);
        System.out.println("((A%C) * (B%C))%C = " + ((A%C) * (B%C))%C);

    }
}
