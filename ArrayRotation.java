/*function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
*
* T.C: O(n*d)
* S.C: O(1)
*
* */
public class ArrayRotation {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int n=a.length;
        int d=3;
        ArrayRotation ar=new ArrayRotation();
      //  ar.rotateJugglingALg(a,n,d);
      //  ar.rotateByReverse(a,n,d);
        ar.rotateByBlockSwap(a,n,d);
        ar.printArray(a,n);

    }

    /*
    T.C: O(n*d)
    S.C: O(1)
     */
    public void rotate(int[] a,int n,int d)
    {
        if(d==0 || d==n){
            return;
        }
        int i,j;
        for(j=0;j<d;j++){
            int temp=a[0];
            for(i=0;i<n-1;i++){
                a[i]=a[i+1];
            }
            a[i]=temp;

        }

    }

    /*
    *Using GCD of n,d
    * T.C : O(n) Oute loop: gcd times
    * inner loop: n/gcd times
    *
    * S.C: O(1)
    *
    * */

    public void rotateJugglingALg(int[] a,int n,int d){
        if(d==0 || d==n){
            return;
        }
        int i,temp,j;
        GCD gcd=new GCD();
        int x=gcd.calculateGCD(n,d);
        for(j=0;j<x;j++){
            temp=a[j];
            for(i=j;i+x<n;i=i+x){
                a[i]=a[i+x];
            }
           // i=i-x; -->wrong
            a[i]=temp;

        }
    }

    /*
    T.C: O(n/2)
     */
    public void arrayReverse(int a[],int x,int n){
        int temp;
         while(x<n){
             temp=a[x];
            a[x]=a[n];
            a[n]=temp;
            x++;
            n--;

        }

    }

    /*
    T.C: O(n)
    O(d/2)+O((n-d)/2)+O(n/2)  each T.C is T.C of arrayReverse().
    First 2 add up to n/2 and this add to last n/2 gives O(n)
     */

    public void rotateByReverse(int[] a,int n,int d){
        if(d==0 || d==n){
            return;
        }
        arrayReverse(a,0,d-1);
        arrayReverse(a,d,n-1);
        arrayReverse(a,0,n-1);
        System.out.println("rotate by reverse");
        //printArray(a,n);

    }

    /*
    T.C: O(n) all calls to blockswap add upto O(n) :-P
     */

    public void rotateByBlockSwap(int a[],int n,int d){

        //int start=0;
        if(n-d==d){
            blockSwap(a,0,n-d,d);
        }
        else if(n-d>d){
            blockSwap(a,0,n-d,d);
            rotateByBlockSwap(a,n-d,d);
        }else{
            //start=d;
            blockSwap(a,d,n-d,n-d);
            rotateByBlockSwap(a,d,n-d);
        }

    }

    /*
    T.C: O(bs) ans bs=d
     */
    public void blockSwap(int[] a,int srcLoc,int destLoc,int bs){
        int temp,i=0;
        while(i<bs){
            temp=a[srcLoc];
            a[srcLoc]=a[destLoc];
            a[destLoc]=temp;
            srcLoc++;
            destLoc++;
            i++;
        }
    }

    public void printArray(int[] a,int n){

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

}
