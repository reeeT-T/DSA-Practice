package Basicrecurrsion;

import java.util.*;

public class sumrec {

    public int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit");
        int x = sc.nextInt();
        sumrec obj = new sumrec();
        System.out.println(obj.sum(x));

        sc.close();
    }
}