package Day3;
class TwoPointerMidReverse {
    public static void main(String[] args) {

        int a[] = {5, 6, 3, 4, 1, 2, 7, 8,9};

        int temp,mid;
        if(a.length %2 == 0){
            mid = a.length / 2;
        }else{
            mid = (a.length / 2) + 1;
        }

        for (int i = 0, j = mid; i < mid-1; i++, j++) {

            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}