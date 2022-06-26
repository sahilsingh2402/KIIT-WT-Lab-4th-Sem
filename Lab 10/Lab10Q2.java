class MyException extends Exception {
    public MyException(String str) {
        System.out.println(str);
    }
}

class Stack {
    int arr[] = new int[5];
    int top;

    public Stack() {
        top = -1;
    }

    public void push(int a) {
        try {
            if (top == 4) {
                throw new MyException("Overflow");
            } else {
                top++;
                arr[top] = a;
                System.out.println("Pushed " + arr[top] + " at index " + top);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public void pop() {
        try {
            if (top == -1) {
                throw new MyException("Underflow");
            } else {
                System.out.println("Popped : " + arr[top]);
                top--;
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

class Lab10Q2 {
    public static void main(String args[]) {
        try {
            Stack ob = new Stack();
            ob.push(1);
            ob.push(2);
            ob.push(3);
            ob.push(4);
            ob.push(5);
            ob.push(6);
            ob.push(7);
            ob.pop();
            ob.pop();
            ob.pop();
            ob.pop();
            ob.pop();
            ob.pop();
            ob.pop();
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }
}

