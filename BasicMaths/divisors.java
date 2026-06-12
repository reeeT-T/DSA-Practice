package BasicMaths;

import java.util.Scanner;

public class divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        sc.close();

        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                if (i != (x / i)) {
                    System.out.println(x / i);
                }
            }
        }
    }
}
