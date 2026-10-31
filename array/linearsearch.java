package array;

import java.util.*;

public class linearsearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to find");
        int x = sc.nextInt();

        int f = -1;
        ;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                f = i;
                break;
            }
        }
        if (f == -1)
            System.out.println("Element not found :(");
        else
            System.out.println("Element found at " + f);

        sc.close();
    }
}
