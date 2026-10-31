package Basicrecurrsion;

import java.util.*;

public class fact {

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit");
        int x = sc.nextInt();
        fact obj = new fact();
        System.out.println(obj.factorial(x));

        sc.close();
    }
}