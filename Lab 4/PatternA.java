import java.util.Scanner;

class PatternA {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of pattern: ");
        int size = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + "");
                ch++;
            }
            ch++;
            System.out.println();
        }

        sc.close();
    }
}

