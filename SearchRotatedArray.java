/*search element in sorted and then rotated array in O(logn). Pivot unknown*/

/*
Idea is to first find pivot and then search. Both methods by binary search
 */
public class SearchRotatedArray {

    public static void main(String[] args) {
        int a[]={3,4,5,1,2};

        SearchRotatedArray sr=new SearchRotatedArray();
        int found=sr.searchElement(a,2);
        if(found!=-1) {
            System.out.println("Found element at " + found);
        }else{
            System.out.println("NOt found");
        }

    }

    public int searchElement(int[] a, int x) {
        int n=a.length;
       // int low=0,high=n-1;
        int pivot=findPivot(a,0,n-1);
        if(pivot==-1){
           return binarySearch(a,0,n-1,x);
        }

        if(a[pivot]==x){
            return pivot;
        }
        if(a[0]<=x){
            return binarySearch(a,0,pivot-1,x);
        }else{
            return binarySearch(a,pivot+1,n-1,x);
        }

    }

    public int binarySearch(int[] a,int low,int high,int x){
       if(low<=high) {
           int mid = (low + high) / 2;
           if (x == a[mid]) {
               return mid;
           } else if (x > a[mid]) {
               return binarySearch(a, mid + 1, high, x);
           } else {
               return binarySearch(a, low, mid - 1, x);
           }
       }else{
           return -1;
       }
    }

    public int findPivot(int[] a,int low,int high) {
        if(high<low){
            return -1;
        }
        if(high==low){
            return low;
        }
        int mid=(low+high)/2;

        if(a[mid]>a[mid+1]){
            return mid+1;
        }
        else if(a[mid]<a[mid-1]){
            return mid;
        }
        else if(a[low]<a[mid]){
           return findPivot(a,mid+1,high);
        }else{
           return findPivot(a,low,mid-1);
        }

    }

}
