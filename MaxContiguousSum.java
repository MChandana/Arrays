public class MaxContiguousSum {

    public static void main(String arg[]){
        int[] a={-2,3,12,-10,4,3};
        int sum=MaxContiguosSum(a);
        System.out.println("final "+sum);
    }

    public static int  MaxContiguosSum(int[] a){
        int sum=0,maxSum=0,maxContiguousSum=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            sum=a[i];
            maxSum=sum;
            for(int j=i+1;j<a.length;j++){
                sum=sum+a[j];
                System.out.println("sum is "+sum);
                if(maxSum<sum){
                    maxSum=sum;
                    System.out.println("maxsum "+maxSum);
                }

            }
            if(maxContiguousSum<maxSum){
                maxContiguousSum=maxSum;
                System.out.println("mcs "+maxContiguousSum);
            }
        }
        return maxContiguousSum;
    }

}
