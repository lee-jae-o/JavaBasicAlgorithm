package basic;

import java.util.Scanner;
public class Practice008 {
    public static void main(String[] args) {

        System.out.println(" <윤년 계산기> ");

        Scanner year = new Scanner(System.in);

        System.out.print("연도를 입력해주세요: ");
        int n = year.nextInt();

        if (n % 4 == 0 && n % 100 != 0) {
            System.out.println(n +"년도는 윤년 입니다.");
        } else if (n % 400 == 0){
            System.out.println(n +"년도는 윤년 입니다.");
        } else {
            System.out.println(n +"년도는 윤년이 아닙니다.");
        }
    }
}
