// try..catch..finally block.
class Lab9Q3 {
    public static void main(String args[]) {
        int array[] = new int[10];
        try {
            array[20] = 10;
        } catch (Exception e) {
            System.out.println("Catch Block Executed!!!");
            System.out.println("Array Index Out Of Bounds Exception!!!");
            System.out.println(e);
        } finally {
            System.out.println("Finally Block Executed!!!");
        }
    }
}

