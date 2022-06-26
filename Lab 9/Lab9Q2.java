
public class Lab9Q2 {
    public static void main(String[] args) {
        try {
            int result = 5 / 0;
            System.out.println("Result is: " + result);
        } catch (Exception e1) {
            System.out.println("Superclass Exception Occured");
        } catch (ArithmeticException e2) {
            System.out.println("Subclass ArithmeticException Occured");
        }
        System.out.println("Block of code becomes unreachable");
    }
}

