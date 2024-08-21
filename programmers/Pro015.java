package programmers;

import java.util.Scanner;

public class Pro015 {

    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals("+")) {
                answer += Integer.valueOf(arr[i + 1]);
            } else if (arr[i].equals("-")) {
                answer -= Integer.valueOf(arr[i + 1]);
            } else {
                continue;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계산할 수식을 입력하세요 (예: 3 + 5 - 2):");
        String input = scanner.nextLine();

        Pro015 pro015 = new Pro015();
        int result = pro015.solution(input);

        System.out.println("결과: " + result);

        scanner.close();
    }
}
