package programmers;

/*** 한 번만 등장한 문자 ***/

import java.util.*;

public class Pro019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Character> uniqueChars = new ArrayList<>();

        for (char c : frequencyMap.keySet()) {
            if (frequencyMap.get(c) == 1) {
                uniqueChars.add(c);
            }
        }

        Collections.sort(uniqueChars);

        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }

        System.out.println(result.toString());
    }
}

