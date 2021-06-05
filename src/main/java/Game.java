import java.util.Scanner;


public class Game {
    public static void main(String args[]) {

        int boardArr[][] = new int[10][10];

        for (int row = 0; row < boardArr.length; row++) {
            for (int col = 0; col < boardArr[row].length; col++) {
                boardArr[row][col] = 0;
                System.out.print(boardArr[row][col] + "\t");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej radek");
        int rowPos = sc.nextInt();
        System.out.println("Zadej sloupec");
        int colPos = sc.nextInt();
        boardArr[rowPos][colPos] = 2;






    }
}
