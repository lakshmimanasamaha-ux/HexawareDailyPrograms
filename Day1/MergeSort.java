import java.util.Scanner;

public class MergeSort {

    public static void merge(int a[], int b, int mid, int l) {

        int n1 = mid - b + 1;
        int n2 = l - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        // Copy elements into temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = a[b + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = a[mid + 1 + j];
        }

        int i = 0, j = 0, k = b;

        // Compare and merge
        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            }
            else {
                a[k] = right[j];
                j++;
            }

            k++;
        }

        // Copy remaining left elements
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    public static void sort(int a[], int b, int l) {

        if (b < l) {

            int mid = (b + l) / 2;

            sort(a, b, mid);

            sort(a, mid + 1, l);

            merge(a, b, mid, l);
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

        sort(a, 0, n - 1);

        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}