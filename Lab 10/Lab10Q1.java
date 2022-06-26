import java.util.*;

class Lab10Q1 {
    static String changeCase(String s) {
        String ans = "";
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c >= 97 && c <= 122) {
                ans += (char) (c - 32);
            } else if (c >= 65 && c <= 90) {
                ans += (char) (c + 32);
            } else {
                ans += (char) c;
            }
        }
        return ans;
    }

    static String Reverse(String s) {
        String ans = "";
        int l = s.length();
        for (int i = 0; i < l; i++) {
            ans = s.charAt(i) + ans;
        }
        return ans;
    }

    static String Compare(String s1, String s2) {
        String ans = (s1.compareTo(s2) > 0) ? s1 : s2;
        return ans;
    }

    static String Insert(String s1, String s2, int i) {
        String ans = s1.substring(0, i) + s2 + s1.substring(i, s1.length());
        return ans;
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = inp.nextLine();
        String changed = changeCase(s);
        System.out.println("Changed Case String: " + changed);
        String reversed = Reverse(s);
        System.out.println("Reversed String: " + reversed);
        System.out.print("Enter one more String to compare: ");
        String s1 = inp.nextLine();
        String greater = Compare(s, s1);
        System.out.println("Greater String: " + greater);
        System.out.print("Enter the index where you want to enter 2nd string in the first: ");
        int i = inp.nextInt();
        String inserted = Insert(s, s1, i);
        System.out.println("Inserted String at index" + i + " : " + inserted);
        inp.close();
    }
}
