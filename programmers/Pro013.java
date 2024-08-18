package programmers;

import java.util.Scanner;

/*** 숫자 찾기 ***/
public class Pro013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 num을 입력하세요: ");
        int num = scanner.nextInt();

        System.out.print("찾고자 하는 숫자 k를 입력하세요: ");
        int k = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.solution(num, k);

        System.out.println("결과: " + result);
    }
}
class Solution {
    public int solution(int num, int k) {
        String num_str = Integer.toString(num);
        String[] array = num_str.split("");

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(Integer.toString(k))) {
                return i + 1;
            }
        }
        return -1;
    }
}
