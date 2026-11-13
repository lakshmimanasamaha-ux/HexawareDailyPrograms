package Day3;

class TwoPointerReverse {
    public static void main(String[] args) {

        int a[] = {5, 7, 1, 2, 3, 4, 6, 7, 8, 9};

        int temp;

        for (int i = 0, j = a.length - 1; i < j; i++, j--) {

            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}