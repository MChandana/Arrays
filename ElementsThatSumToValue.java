
/*Given an array of integers, Check if there exist four elements at different indexes in the array
whose sum is equal to a given value k*/
public class ElementsThatSumToValue {

    public static void main(String a[]){

        int[] b={38 ,7, 44, 42, 28, 16, 10, 37,
                33, 2, 38, 29, 26, 8, 25};
        int k=22;
        ElementsThatSumToValue e=new ElementsThatSumToValue();
        e.checkSum(b,k);
    }

    public void checkSum(int[] b,int k){
        int sum=0,flag=0;
        for(int i=0;i<b.length;i++)
        {
            sum=0;
            for(int j=i;j<b.length;j++){
                sum+=b[j];
                if(sum<k){
                    continue;
                }
                if(sum==k){
                    flag=1;
                    break;
                }
                if(sum>k){
                    break;
                }
            }
            if(flag==1){
                System.out.println("YES");
                break;

            }

        }
    }
}
