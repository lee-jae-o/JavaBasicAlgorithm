package basic;

import java.util.Scanner;

public class Practice026 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("단어를 입력해주세요: ");
        String word = sc.nextLine();

        System.out.println("단어의 길이: " + word.length());

    }
}
