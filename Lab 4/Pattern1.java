import java.util.*;

class Pattern1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern:");
        int size = sc.nextInt();
        for (int i = 1; i < size; i++) {
            System.out.print("  ");
        }
        System.out.print("1");
        System.out.println();

        for (int i = 2; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

