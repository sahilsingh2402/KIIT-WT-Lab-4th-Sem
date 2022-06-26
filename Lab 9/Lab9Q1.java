// ArrayIndexOutofBoundsException and handle it using catch statement
class Lab9Q1 {
    public static void main(String args[]) {
        int array[] = new int[10];
        try {
            array[20] = 10;
        } catch (Exception e) {
            System.out.println("Array Index Out Of Bounds Exception!!!");
            System.out.println(e);
        }
    }
}

