package patterns;

import java.util.*;

public class pattern12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int rows = sc.nextInt();
        /*
         * for (int i = 1; i <= rows; i++) {
         * for (int j = 1; j <= i; j++) {
         * 
         * if (i % 2 == 0) {
         * if (j % 2 == 0)
         * System.out.print("1");
         * else
         * System.out.print("0");
         * } else {
         * if (j % 2 == 0)
         * System.out.print("0");
         * else
         * System.out.print("1");
         * }
         * }
         * System.out.println();
         * }
         */
        int s = 1;
        for (int i = 0; i <= rows; i++) {
            if (i % 2 == 0)
                s = 1;
            else
                s = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(s);
                s = 1 - s;
            }
            System.out.println();
        }
        sc.close();
    }
}
