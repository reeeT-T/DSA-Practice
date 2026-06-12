package BasicMaths;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        sc.close();
        int c = 0;
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                c++;
                if (i != (x / i)) {
                    c++;
                }
            }
        }
        if (c == 2)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}