package basic;

import java.util.Scanner;

public class Practice010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("개수 입력: ");
        int T = sc.nextInt();

        for (int i=0; i<T; i++) {

            System.out.print("A입력: ");
            int A = sc.nextInt();
            System.out.print("B입력: ");
            int B = sc.nextInt();

            System.out.println("A + B = " +(A+B));

        }
        System.out.println("------------");
        System.out.println("계산 종료");
    }
}

