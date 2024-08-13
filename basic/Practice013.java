package basic;

import java.util.Scanner;

public class Practice013 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("<사분면 고르기>");
        System.out.println("-------------");

        System.out.print("x축 입력: ");
        int x = sc.nextInt();

        System.out.print("y축 입력: ");
        int y = sc.nextInt();

        //1사분면
        if (x >= 1 && y >= 1) {
            System.out.println("1사분면 입니다.");
        }

        //2사분면
        if (x <= -1 && y >= 1) {
            System.out.println("2사분면 입니다.");
        }

        //3사분면
        if (x <= -1 && y <= -1) {
            System.out.println("3사분면 입니다.");
        }

        //4사분면
        if (x >= 1 && y <= -1) {
            System.out.println("4사분면 입니다.");
        }
    }
}
