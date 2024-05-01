package lesson18;

public class BattleShip {
    public static void main(String[] args) {
        char[][] table = new char[5][5];

        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " | ");
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(table[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
