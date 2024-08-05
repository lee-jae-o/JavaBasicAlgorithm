package basic;

import java.util.Scanner;

public class Practice003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("A값 입력: " );
        float A = sc.nextInt();

        System.out.print("B값 입력: ");
        float B = sc.nextInt();

        System.out.println("----------");

        System.out.println("A + B = " + (A+B));
        System.out.println("A - B = " + (A-B));
        System.out.println("A x B = " + (A*B));
        System.out.println("A / B = " + (A/B));
        System.out.println("A % B = " + (A%B));

    }

}
