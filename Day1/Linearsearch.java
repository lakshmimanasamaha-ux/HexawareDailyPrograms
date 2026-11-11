import java.util.Scanner;

public class Linearsearch {

    public static int search(int a[], int val) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == val) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[100];

        System.out.println("Enter the size:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int val = 29;

        int result = search(a, val);

        if (result != -1) {
            System.out.println("Index: " + result);
        }
        else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}