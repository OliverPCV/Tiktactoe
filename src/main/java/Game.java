import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Game {

    public static void main(String args[]) {

        char boardArr[][] = new char[10][10];
        int choose = 0;

        ArrayList<Player> players = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1. Pridej hrace");
            System.out.println("2. Zacni hru");

            choose = sc.nextInt();

            if(choose == 1){
                System.out.println("Zadej jmeno hrace");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.println("Zadej symbol pro " + name);
                char symbol = sc.next().charAt(0);
                Player player = new Player(name, symbol);

                players.add(player);

                for (int playersInArraylist = 0; playersInArraylist < players.size(); playersInArraylist++){
                    System.out.println(players.get(playersInArraylist).toString());
                }

            } else if (choose == 2){
                for (int row = 0; row < boardArr.length; row++) {
                    for (int col = 0; col < boardArr[row].length; col++) {
                        boardArr[row][col] = '-';
                        System.out.print(boardArr[row][col] + "\t");
                    }
                    System.out.println();
                }

                System.out.println("Zadej radek");
                int rowPos = sc.nextInt() - 1;

                System.out.println("Zadej sloupec");
                int colPos = sc.nextInt() - 1;

                boardArr[rowPos][colPos] = 'X';

                for (int i = 0; i < boardArr.length; i++){
                    for (int j = 0; j < boardArr.length; j++){
                        System.out.print(boardArr[i][j] + "\t");
                    }
                    System.out.println();
                }

            }
        } while(choose != 2);

    }

}



