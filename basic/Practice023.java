package basic;

import java.util.Scanner;

public class Practice023 {
    public static void main(String[] args) {

        int chessPieces[] = {1,1,2,2,2,8};

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<6; i++) {
            int currentChessPieces = sc.nextInt();
            int result = chessPieces[i] - currentChessPieces;
            System.out.print(result + " ");
        }



    }
}
