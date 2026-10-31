package Basicrecurrsion;

import java.util.*;

public class revarr {
    public int[] rev(int x[], int n) {
        int p1 = 0;
        int p2 = n - 1;

        for (int i = 0; i <= (n / 2) - 1; i++) {
            int temp = x[p1];
            x[p1] = x[p2];
            x[p2] = temp;
            p1++;
            p2--;
        }
        return x;
    }

    public List<Integer> rev1(List<Integer> x) {
        Collections.reverse(x);
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        List<Integer> ar = new ArrayList<>(n);

        System.out.println("Enter array");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            ar.add(arr[i]);
        }

        revarr obj = new revarr();
        int rarr[] = new int[n];
        List rar = new ArrayList<>(n);
        rarr = obj.rev(arr, n);
        rar = obj.rev1(ar);

        for (int i = 0; i < 10; i++) {
            System.out.print(rarr[i] + " ");
        }
        System.out.println("collection");
        System.out.println(rar);

        sc.close();
    }
}
