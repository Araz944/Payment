package array;

public class twoDimensionalArrayApp {
    public static void main(String[] args) {
//        int[][] twoDArray = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//
////        System.out.println("2-Dimensional Array:");
//        for (int[] ints : twoDArray) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        int[][] nums = new int[5][5];

        int counter = 0;
        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < nums.length; column++) {
                nums[row][column] = counter++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
