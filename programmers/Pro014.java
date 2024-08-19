package programmers;

/*** 배열의 유사도 ***/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pro014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("s1 배열의 크기: ");
        int n1 = sc.nextInt();
        String[] s1 = new String[n1];
        System.out.println("s1 배열의 요소들을 입력하세요:");
        for(int i = 0; i < n1; i++) {
            s1[i] = sc.next();
        }

        System.out.print("s2 배열의 크기: ");
        int n2 = sc.nextInt();
        String[] s2 = new String[n2];
        System.out.println("s2 배열의 요소들을 입력하세요:");
        for(int i = 0; i < n2; i++) {
            s2[i] = sc.next();
        }

        System.out.println("두 배열의 공통 원소 개수: " + solution(s1, s2));

        sc.close();
    }

    public static int solution(String[] s1, String[] s2) {

        Set<String> set1 = new HashSet<>();
        for (String str : s1) {
            set1.add(str);
        }

        int count = 0;
        for (String str : s2) {
            if (set1.contains(str)) {
                count++;
            }
        }

        return count;
    }
}
