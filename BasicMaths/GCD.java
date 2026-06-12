package BasicMaths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (x > 0 && y > 0) {
            if (x > y)
                x = x % y;
            else
                y = y % x;
        }
        if (x == 0)
            System.out.println("GCD= " + y);
        else
            System.out.println("GCD= " + x);

        sc.close();
    }
}
