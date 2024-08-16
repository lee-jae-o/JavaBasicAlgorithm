package programmers;

import java.util.Scanner;

/*** n의 배수 고르기 ***/
import java.util.ArrayList;
import java.util.List;

public class Pro012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 n을 입력하세요: ");
        int n = scanner.nextInt();

        System.out.print("numlist의 크기를 입력하세요: ");
        int size = scanner.nextInt();

        int[] numlist = new int[size];
        System.out.println("numlist의 원소들을 입력하세요: ");
        for (int i = 0; i < size; i++) {
            numlist[i] = scanner.nextInt();
        }

        List<Integer> result = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0) {
                result.add(num);
            }
        }

        System.out.println("n의 배수인 원소들: " + result);

        scanner.close();
    }
}
