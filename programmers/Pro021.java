package programmers;
/*** 영어가 싫어요 ***/

import java.util.HashMap;
import java.util.Scanner;

public class Pro021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numbers = sc.nextLine();

        HashMap<String, String> numMap = new HashMap<>();
        numMap.put("zero", "0");
        numMap.put("one", "1");
        numMap.put("two", "2");
        numMap.put("three", "3");
        numMap.put("four", "4");
        numMap.put("five", "5");
        numMap.put("six", "6");
        numMap.put("seven", "7");
        numMap.put("eight", "8");
        numMap.put("nine", "9");

        StringBuilder result = new StringBuilder();

        String temp = "";
        for (int i = 0; i < numbers.length(); i++) {
            temp += numbers.charAt(i);
            if (numMap.containsKey(temp)) {
                result.append(numMap.get(temp));
                temp = "";
            }
        }

        System.out.println(result.toString());

        sc.close();
    }
}
