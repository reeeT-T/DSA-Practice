package BasicMaths;

import java.util.*;

public class palindromenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int dupe = x;
        int rev = 0;
        while (x > 0) {
            int r = x % 10;
            x /= 10;
            rev = (rev * 10) + r;
        }
        if (dupe == rev)
            System.out.println("Palinrome :)");
        else
            System.out.println("Not Palindrome :(");
        sc.close();
    }
}
