package basic;

import java.util.Scanner;

public class Practice004 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("시험 점수 입력: ");
        int Score = sc.nextInt();

        if (Score >= 90) {
            System.out.print("A");
        }
        else if (Score >= 80) {
            System.out.print("B");
        }
        else if (Score >= 70) {
            System.out.print("C");
        }
        else if (Score >= 60) {
            System.out.print("D");
        }
        else {
            System.out.print("F");
        }
    }
}
