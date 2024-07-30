package programmers;

import java.util.Scanner;

public class Pro001 {

    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total / num) - ((num - 1) / 2);

        for (int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 num과 total 입력 받기
        System.out.print("num을 입력하세요: ");
        int num = scanner.nextInt();

        System.out.print("total을 입력하세요: ");
        int total = scanner.nextInt();

        // Pro001 객체 생성 후 solution 메서드 호출
        Pro001 pro = new Pro001();
        int[] result = pro.solution(num, total);

        // 결과 출력
        System.out.print("결과: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
