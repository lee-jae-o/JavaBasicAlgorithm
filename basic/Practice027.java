package basic;

import java.util.Scanner;

public class Practice027 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.print("고유번호 입력: ");
        for (int i=0; i<5; i++) {
            int temp = sc.nextInt();
            sum += temp*temp;
        }
        System.out.println("검증수: " + sum%10);
    }
}
