package patterns;

import java.util.*;

class pattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            int c = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) c);
                c++;
            }
            System.out.println();
        }
        sc.close();
    }
}