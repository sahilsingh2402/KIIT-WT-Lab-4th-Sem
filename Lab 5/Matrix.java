import java.util.*;

class Matrix {
    private double[][] mat;
    int row, column;

    // constructor
    Matrix() {
        row = 0;
        column = 0;
    }

    // constructor
    Matrix(int r, int c) {
        row = r;
        column = c;
        mat = new double[row][column];
    }

    // function to accept Matrix values from user
    public void get_input() {
        Scanner s = new Scanner(System.in);
        int i = 0, j = 0;

        System.out.println("Enter the Matrix elements(row-wise)");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                mat[i][j] = s.nextDouble();
            }

        }
    }

    // function to print Matrix
    public void print_Matrix() {
        int i = 0, j = 0;
        System.out.println("The Matrix is: ");
        for (i = 0; i < row; i++) {
            System.out.println("");
            for (j = 0; j < column; j++) {
                System.out.print("   " + mat[i][j]);
            }

        }
    }

    // function to add 2 matrices
    public Matrix add(Matrix m1) {
        Matrix ans = new Matrix(row, column);
        int i = 0, j = 0;
        if (this.row != m1.row || this.column != m1.column) {
            System.out.println("Matrices cannot be added!");
        } else {
            for (i = 0; i < row; i++) {
                for (j = 0; j < column; j++) {
                    ans.mat[i][j] = this.mat[i][j] + m1.mat[i][j];
                }
            }
        }
        return ans;
    }

    // function to multiply 2 matrices
    public Matrix mul(Matrix m1) {
        Matrix ans = new Matrix(row, column);
        int i = 0, j = 0;
        if (this.column != m1.row) {
            System.out.println("Matrices cannot be added!");
        } else {
            for (i = 0; i < row; i++) {
                for (j = 0; j < column; j++) {
                    ans.mat[i][j] += this.mat[i][j] * m1.mat[j][i];
                }
            }
        }
        return ans;
    }
}

class Operations {

    private static Matrix m1, m2, ans;

    public static void main(String args[]) {
        int i = 0, j = 0, r = 0, c = 0;
        Scanner s = new Scanner(System.in);

        // get the no. of rows and columns of the Matrix from the user
        System.out.println("\nEnter no. of rows:");
        r = s.nextInt();
        System.out.println("Enter no. of columns:");
        c = s.nextInt();

        // accept the first Matrix
        System.out.println("\nEnter the first Matrix: ");
        m1 = new Matrix(r, c);
        m1.get_input();

        // get the no. of rows and columns of the Matrix from the user
        System.out.println("\nEnter no. of rows:");
        r = s.nextInt();
        System.out.println("Enter no. of columns:");
        c = s.nextInt();

        // accept the second Matrix
        System.out.println("\nEnter the second Matrix: ");
        m2 = new Matrix(r, c);
        m2.get_input();

        // Add the 2 matrices and print the result
        ans = m1.add(m2);
        System.out.println("\nAddition of the two matrices is: ");
        ans.print_Matrix();

        // Multiply the 2 matrices and print the result
        ans = m1.mul(m2);
        System.out.println("\nMultiplication of the two matrices is: ");
        ans.print_Matrix();
        s.close();
    }
}

