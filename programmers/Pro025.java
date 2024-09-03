package programmers;

import java.util.Scanner;

/*** 가까운 수 ***/
public class Pro025 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] dis = new int[array.length];
        for(int i=0;i<array.length;i++){
            dis[i] = Math.abs(array[i]-n);
        }
        int min = dis[0];
        for(int i=0;i<array.length;i++){
            if(min>dis[i]){
                min = dis[i];
                answer = array[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("배열의 원소를 입력하세요:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("n 값을 입력하세요: ");
        int n = scanner.nextInt();

        Pro025 pro = new Pro025();
        int result = pro.solution(array, n);

        System.out.println("가장 가까운 수: " + result);

        scanner.close();
    }
}