package BasicMaths;

import java.util.*;

public class countdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int c = 0;
        while (x > 0) {
            x = x / 10;
            c++;
        }
        System.out.println("number of digits = " + c);
        sc.close();
    }
}
