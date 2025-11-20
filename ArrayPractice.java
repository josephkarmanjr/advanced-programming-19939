public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println("One-dimensional Array:");
        int[] oneDArray = {10, 20, 30, 40, 50};
        
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        System.out.println();

        System.out.println("\nTwo-dimensional Array:");
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}