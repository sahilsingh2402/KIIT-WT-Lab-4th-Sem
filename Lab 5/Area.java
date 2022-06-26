import java.util.Scanner;

class Area {
    void area(int a) {
        System.out.println("\nArea of square :" + a * a);
    }

    void area(float a) {
        System.out.println("\nArea of circle :" + 3.14 * a * a);
    }

    void area(int a, int b, int c) {
        double temp = (a + b + c);
        double s = temp / 2;
        double triarea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("\nArea of triangle: " + triarea);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Area d = new Area();

        System.out.print("\nShapes available: \n1) Square \n2) Triangle \n3) Circle \nEnter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("\nEnter the side of square: ");
                int a = sc.nextInt();
                d.area(a);
                break;
            case 2:
                System.out.print("\nEnter first side: ");
                int x = sc.nextInt();
                System.out.print("\nEnter second side: ");
                int y = sc.nextInt();
                System.out.print("\nEnter third side: ");
                int z = sc.nextInt();
                d.area(x, y, z);
                break;
            case 3:
                System.out.print("\nEnter the radius: ");
                int r = sc.nextInt();
                d.area(r);
                break;
            default:
                System.out.println("Invalid choice!!!");
        }
        sc.close();
    }
}

