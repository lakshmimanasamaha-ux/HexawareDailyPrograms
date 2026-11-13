package Day3;

public class TwoPointerMerge {
    public static void main(String[] args) {

        int[] a = {1, 3, 4, 6, 9, 2, 5, 7, 12};

        int[] Final = new int[a.length];

        int i, j, c;

        for (i = 0, j = a.length / 2, c = 0;
             i < a.length / 2 && j < a.length;
             c++) {

            if (a[i] < a[j]) {
                Final[c] = a[i];
                i++;
            } else {
                Final[c] = a[j];
                j++;
            }
        }

        for (; i < a.length / 2; i++, c++) {
            Final[c] = a[i];
        }

        for (; j < a.length; j++, c++) {
            Final[c] = a[j];
        }

        for (int k = 0; k < Final.length; k++) {
            System.out.print(Final[k] + " ");
        }
    }
}
