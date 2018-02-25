public class PointsComposeToGivenNumber {

    private int score=3;
    private int n=4;

    public static void main(String ar[]){
        int[] a=new int[10];
        PointsComposeToGivenNumber p=new PointsComposeToGivenNumber();
        p.count(a,0);

    }

    public void count(int[] a,int j){
        int i,sum;
            for(i=1;i<=score;i++){
                a[j]=i;
                sum=calsum(a,j);
                if(sum<n)
                {
                    count(a,j+1);
                }
                if(sum>n){
                    break;
                }
               // count(a,n,j+1,sum);
                if(sum==n){
                    printArray(a,j);
                    return;
                }
            }


    }

    public int calsum(int[] a,int j){
        int sum=0;
        for(int i=0;i<=j;i++){
            sum+=a[i];
        }
        return sum;

    }

    public void printArray(int[] a,int m){
        for(int i=0;i<=m;i++){
            System.out.print(a[i]);
        }
        System.out.println("\n");
    }
}
