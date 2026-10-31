package Basicrecurrsion;

import java.util.Scanner;

public class countrec {
    public void print(int n) {
        if (n == 0)
            System.out.println("");
        else {
            print(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        countrec obj = new countrec();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit");
        int x = sc.nextInt();
        obj.print(x);
        sc.close();
    }

}
