package patterns;

import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) { // when i= 1 then print 1 star, when i=2 then print 2 stars and so on
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
