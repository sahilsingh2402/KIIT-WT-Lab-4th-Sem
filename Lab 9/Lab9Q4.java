class NegativeNumberException extends Exception {
    public NegativeNumberException(String str) {
        System.out.println(str);
    }
}

class Check {
    public void ProcessInput(int num) {
        try {
            if (num < 0) {
                throw new NegativeNumberException("Number is negative");
            } else {
                System.out.println("Double Number: " + (2 * num));
            }
        } catch (Exception e) {
            System.out.println("Caught Exception Negative Number!!!");
        }
    }
}

class Lab9Q4 {
    public static void main(String args[]) {
        int a = 5;
        Check obj = new Check();
        obj.ProcessInput(a);
    }
}
