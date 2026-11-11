import java.util.Scanner;

public class BinnarySearch {

    public static int search(int a[], int val, int n) {

        int b = 0;
        int l = n - 1;

        while (b <= l) {

            int mid = (b + l) / 2;

            if (a[mid] == val) {
                return mid;
            }
            else if (val < a[mid]) {
                l = mid - 1;
            }
            else {
                b = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[100];

        System.out.println("Enter size:");
        int n = sc.nextInt();

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter value to search:");
        int val = sc.nextInt();

        int result = search(a, val ,n);

        if (result != -1) {
            System.out.println("Found");
            System.out.println("Position: " + (result + 1));
        }
        else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}