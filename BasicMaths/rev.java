package BasicMaths;

import java.util.*;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int rev = 0;
        while (x > 0) {
            int r = x % 10;
            x /= 10;
            rev = (rev * 10) + r;
        }
        System.out.println("Reverse: " + rev);
        sc.close();
    }
}