import java.util.Scanner;

class Palindrome {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check:");
        int num = sc.nextInt();

        int reversedNum = 0;
        int remainder;

        int temp = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (temp == reversedNum) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}

