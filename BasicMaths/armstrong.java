package BasicMaths;

import java.util.Scanner;
import java.lang.Math;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int dupe = x;
        int c = 0;
        double sum = 0;
        while (x > 0) {
            x = x / 10;
            c++;
        }
        x = dupe;
        while (x > 0) {
            int r = x % 10;
            x = x / 10;
            sum = sum + (Math.pow(r, c));
        }

        if (dupe == sum)
            System.out.println("Armstrong :)");
        else
            System.out.println("Not Armstrong :(");
        sc.close();

    }
}
