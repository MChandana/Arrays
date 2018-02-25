public class GCD {
    public static void main(String[] args) {
        int a=3;
        int b=12;
        GCD gcd=new GCD();
        System.out.println(gcd.calculateGCD(b,a));
    }

    public int calculateGCD(int a, int b) {
        if(b==0)
            return a;
        else{
            return calculateGCD(b,a%b);
        }
    }


}
