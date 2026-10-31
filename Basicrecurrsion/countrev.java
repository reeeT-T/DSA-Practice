package Basicrecurrsion;

import java.util.Scanner;

public class countrev {
    public void print(int n) {
        if (n == 0)
            System.out.println("");
        else {
            System.out.println(n);
            print(n - 1);
        }
    }

    public static void main(String[] args) {
        countrev obj = new countrev();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit");
        int x = sc.nextInt();
        obj.print(x);
        sc.close();
    }
}
