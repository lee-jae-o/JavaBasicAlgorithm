package programmers;
/*** 편지 ***/

import java.util.Scanner;
public class Pro017 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("메시지를 입력하세요: ");
        String message = scanner.nextLine();

        int messageLength = message.length();

        int paperWidth = messageLength * 2;

        System.out.println("필요한 편지지의 최소 가로길이: " + paperWidth + "cm");

        scanner.close();
    }
}
