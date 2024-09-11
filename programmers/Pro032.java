package programmers;
/*** 로그인 성공? ***/

import java.util.Scanner;

public class Pro032 {
    public String solution(String[] id_pw, String[][] db) {
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디를 입력하세요: ");
        String inputId = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String inputPw = scanner.nextLine();

        String[][] db = {
                {"meosseuk", "password123"},
                {"testuser", "testpw"},
                {"javafan", "ilovespring"}
        };

        String[] id_pw = {inputId, inputPw};

        Pro032 pro = new Pro032();
        String result = pro.solution(id_pw, db);

        System.out.println("로그인 결과: " + result);

        scanner.close();
    }
}
