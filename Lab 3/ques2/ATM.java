import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long amount = 100000;

        while (true) {

            System.out.println("\n---Automated Teller Machine---");
            System.out.println("|     1.CHeck balance        |");
            System.out.println("|     2.Withdraw balance     |");
            System.out.println("|     3.Deposit balnce       |");
            System.out.println("|     4.Exit                 |");
            System.out.println("|----------------------------|\n\nWelcome to ATM\nEnter option(1-4): ");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("\nYour current amount balance is : $" + amount);
                    break;

                case 2:
                    System.out.println("\nEnter money to withdraw");
                    int draw = sc.nextInt();
                    amount -= draw;
                    System.out.println("\n$" + draw + " has been withdrawn");
                    break;
                case 3:
                    System.out.println("\nEnter balance to deposit :");
                    int add = sc.nextInt();
                    amount += add;
                    System.out.println("\n$" + add + " has been added to your account");
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}


