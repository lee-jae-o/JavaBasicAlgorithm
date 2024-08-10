package programmers;

import java.util.Scanner;

/*** 문자열안에 문자열 ***/
public class Pro009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("전체 문자열 입력: ");
        String str1 = sc.nextLine();

        System.out.print("확인하고 싶은 문자열 입력: ");
        String str2 = sc.nextLine();

        if (str1.contains(str2)) {
            System.out.println(str2 +"는 전체 문자열에 포함되어 있습니다.");
        } else {
            System.out.println(str2 + "는 전체 문자열에 포함되어 있지 않습니다.");
        }
    }
}


