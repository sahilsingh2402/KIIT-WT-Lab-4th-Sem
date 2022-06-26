import java.util.Scanner;

class plate {
    int length, width;

    plate() {
        System.out.println("Parent Class Constructor Called!!!");
    }
}

class box extends plate {
    int height;

    box() {
        System.out.println("Child Class Constructor Called!!!");
    }
}

class wood_box extends box {
    int thickness;

    wood_box() {
        System.out.println("Grandchild Class Constructor Called!!!");
    }
}

class MLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        wood_box obj = new wood_box();
        sc.close();
    }
}

