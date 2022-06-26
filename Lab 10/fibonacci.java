import java.util.Scanner;

public class fibonacci {
    static void printMatrix(int M[][], int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }

    static int[][] multiplyMatrix(int row1, int col1, int A[][], int row2, int col2, int B[][]) {
        int i, j, k;

        // Check if multiplication is Possible
        if (row2 != col1) {

            System.out.println("\nMultiplication Not Possible");

        } else {
            int C[][] = new int[row1][col2];

            // Multiply the two matrices
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col2; j++) {
                    for (k = 0; k < row2; k++)
                        C[i][j] += A[i][k] * B[k][j];
                }
            }
            return C;
        }

        // Matrix to store the result
        // The product matrix will
        // be of size row1 x col2

    }

    public static void main(String[] args) {
        int n, m;
        System.out.println("Enter n");
        Scanner s1 = new Scanner(System.in);
        n = s1.nextInt();
        System.out.println("Enter m");
        m = s1.nextInt();
        System.out.println("Enter the matrix");
        int[][] fib = new int[n][m];
        int x;
        System.out.println("Enter the nth fibonacci you want to calculate");
        x = s1.nextInt();

    }
}