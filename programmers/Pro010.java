package programmers;

/*** OX퀴즈 ***/

import java.util.Scanner;
public class Pro010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 수식을 입력하시겠습니까? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] quiz = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "번째 수식을 입력하세요 (예: 3 + 2 = 5): ");
            quiz[i] = scanner.nextLine();
        }

        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {

            String arr[] = quiz[i].split(" ");

            int left = arr[1].equals("+") ? Integer.parseInt(arr[0]) + Integer.parseInt(arr[2])
                    : Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            int right = Integer.parseInt(arr[4]);

            answer[i] = left == right ? "O" : "X";
        }

        System.out.println("결과:");
        for (int i = 0; i < answer.length; i++) {
            System.out.println(quiz[i] + " -> " + answer[i]);
        }

        scanner.close();
    }
}
