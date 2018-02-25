import java.util.Arrays;

public class RecursiveInsertionSort {
    //static int i,j;
    public static void main(String[] args) {
        int[] a={10,9,8,6,5,3};
        //is(a,a.length);
        System.out.println(Arrays.toString(a));

         sort(a,1,0,a[1]);
        System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(resultArr));
    }

    private static void is(int[] a, int n) {
        if(n<=1){
            return;
        }

            is(a,n-1);
            int k=a[n-1];
            int j=n-2;
            while(j>=0 && a[j]>=k){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;

    }


    private static void sort(int[] arr, int i, int j, int key){

        if(i==arr.length)
            return;
        if(j<0 || arr[j] < key){
            arr[j+1] = key;
            if(i+1 != arr.length)
                key = arr[i+1];
            sort(arr,i+1,i,key);
            return;
        }

        else{

            if(arr[j] > key){
                arr[j+1] = arr[j];
                j=j-1;
                sort(arr,i,j,key);

            }


        }

    }
}
