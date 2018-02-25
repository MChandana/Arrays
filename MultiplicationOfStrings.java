import static java.lang.System.nanoTime;

/* use Integer.parseInt(x) for min time and optimal solution*/

public class MultiplicationOfStrings {


    public static void main(String[] args) {
        long start=System.nanoTime();
        String a="123";
        String b="43";
        MultiplicationOfStrings ms=new MultiplicationOfStrings();
        int a_int=ms.convertQ(a);
        int b_int=ms.convertQ(b);
        int result=a_int*b_int;
        String res= String.valueOf(result);
        long end=System.nanoTime();
        System.out.println(start);
        System.out.println(end);
        System.out.println("Took "+(end-start)/1000000);
        long start1=System.nanoTime();
        System.out.println(start1);
        a_int=ms.convert(a);
        b_int=ms.convert(b);
        int res1=a_int*b_int;
        System.out.println("res="+res1);
        long end1=System.nanoTime();
        System.out.println(end1);
        System.out.println("Took "+(end1-start1)/1000000);

    }

    public int convert(String a){
        int value=0,j=1;
        char ary[]=a.toCharArray();
        for(int i=ary.length-1;i>=0;i--){
           char c=a.charAt(i);
           int x=Character.getNumericValue(c);
           value=value+x*j;
           j=j*10;
        }
        System.out.println(value);
        return value;
    }

    public int convertQ(String a){
        int x=Integer.parseInt(a);
        return x;
    }


}
