import java.util.Scanner;

public class InsertionSort {

    public static void sort(int a[], int n) {

        for (int i = 1; i < n; i++) {

            int temp = a[i];
            int j = i;

            while (j > 0 && a[j - 1] > temp) {

                a[j] = a[j - 1];
                j--;
            }

            a[j] = temp;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[100];

        System.out.println("Enter size:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sort(a, n);

        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}