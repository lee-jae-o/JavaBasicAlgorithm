package programmers;

import java.util.Scanner;

public class Pro016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("배열의 원소를 입력하세요:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] result = solution(array);
        System.out.println("가장 큰 수: " + result[0] + ", 인덱스: " + result[1]);

        scanner.close();
    }
    public static int[] solution(int[] array) {
        int max = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return new int[]{max, index};
    }
}
