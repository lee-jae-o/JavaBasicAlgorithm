package basic;

import java.util.Scanner;

public class Practice001 {
    public static void main(String[] args) {

        Scanner cal = new Scanner(System.in);

        System.out.print("A값 입력: ");
        int A = cal.nextInt();

        System.out.print("B값 입력: ");
        int B = cal.nextInt();

        System.out.println("A + B = " + (A+B) );
        System.out.println("A - B = " + (A-B) );
        System.out.println("A * B = " + (A*B) );
        System.out.println("A / B = " + (A/B) );
    }
}
