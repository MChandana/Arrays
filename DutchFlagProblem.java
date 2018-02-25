public class DutchFlagProblem {

    public static void main(String arg[]) {
        int[] a = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int low = 0;
        int mid = 0, temp = 0;
        int high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                if (a[mid] == 2) {
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                   // mid++;
                    high--;
                }
            }


        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
