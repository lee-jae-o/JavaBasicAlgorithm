package programmers;
/*** 암호 해독 ***/

import java.util.Scanner;
public class Pro023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("암호를 입력하세요: ");
        String cipher = sc.nextLine();

        System.out.print("코드를 입력하세요: ");
        int code = sc.nextInt();

        String decodedMessage = solution(cipher, code);
        System.out.println("해독된 암호: " + decodedMessage);

        sc.close();
    }

    public static String solution(String cipher, int code) {
        StringBuilder decoded = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            decoded.append(cipher.charAt(i));
        }

        return decoded.toString();
    }

}
