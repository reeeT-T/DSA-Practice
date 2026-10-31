package Basicrecurrsion;

import java.util.*;

public class printntimes {
    public void print(int n, String mes) {
        if (n == 0)
            System.out.println("");
        else {
            print(n - 1, mes);
            System.out.println(mes);
        }
    }

    public static void main(String[] args) {
        printntimes obj = new printntimes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of times to print");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter message");
        String s = sc.nextLine();
        obj.print(x, s);
        sc.close();
    }
}
