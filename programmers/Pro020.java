package programmers;
/*** 인덱스 바꾸기 ***/

import java.util.Scanner;

public class Pro020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String my_string = sc.nextLine();

        System.out.print("첫 번째 인덱스를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 인덱스를 입력하세요: ");
        int num2 = sc.nextInt();

        String result = solution(my_string, num1, num2);

        System.out.println("결과 문자열: " + result);
    }

    public static String solution(String my_string, int num1, int num2) {

        char[] charArray = my_string.toCharArray();

        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;

        return new String(charArray);
    }
}
