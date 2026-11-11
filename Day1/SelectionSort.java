import java.util.Scanner;

public class SelectionSort {

    public static void sort(int a[], int n) {

        int c = 0,pos = 0;
        for (int i = 0; i < n - 1; i++) {

            int min = a[i];

            for (int j = i + 1; j < n; j++) {

                if (a[j] < min) {
                    c++;
                    min = a[j];
                    pos = j;
                }
            }

            if(c>0){
                int temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;
                c=0;
            }
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