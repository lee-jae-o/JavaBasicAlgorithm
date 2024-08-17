package basic;

import java.util.Scanner;

public class Practice017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A > 0 && B < 10) {
                System.out.println(A + B);
            }
        }
        sc.close();
    }
}
