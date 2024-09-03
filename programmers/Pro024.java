package programmers;
/*** 369 게임 ***/

import java.util.Scanner;

public class Pro024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("머쓱이가 말해야 할 숫자를 입력하세요: ");
        int order = scanner.nextInt();

        int result = solution(order);
        System.out.println("머쓱이가 쳐야 할 박수 횟수: " + result);
    }

    public static int solution(int order) {
        int count = 0;
        String numberStr = String.valueOf(order);

        for (char c : numberStr.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                count++;
            }
        }

        return count;
    }
}


