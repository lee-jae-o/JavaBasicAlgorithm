package basic;

import java.util.Scanner;

public class Practice029 {
    public static void main(String[] args) {
        int A[] = new int[31];

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<28; i++) {
            int n = sc.nextInt();
            A[n]++;
        }

        for (int i=1; i<=30; i++) {
            if (A[i]==0) System.out.println(i);
        }
    }
}
