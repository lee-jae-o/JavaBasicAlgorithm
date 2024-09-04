package programmers;

import java.util.Arrays;
import java.util.Scanner;

/*** 삼각형의 완성조건(1) ***/
public class Pro026 {
    public static int solution(int[] sides) {
        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sides = new int[3];
        System.out.println("세 변의 길이를 입력하세요:");
        for (int i = 0; i < 3; i++) {
            sides[i] = sc.nextInt();
        }

        int result = solution(sides);
        System.out.println("결과: " + result);
    }
}
