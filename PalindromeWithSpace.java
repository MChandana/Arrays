public class PalindromeWithSpace {

    public static void main(String arg[]){
        String ab="an ant na na";
        int i=0;
        int flag=0;
        int j=ab.length()-1;
        char[] a=ab.toCharArray();
        while(i<j){
            if(a[i]==(a[j])){
                i++;
                j--;
            }else{
                flag=1;
                break;
            }
            if(a[i]==' '){
                i++;
            }
            if(a[j]==' '){
                j--;
            }
        }
        if(flag==0){
            System.out.println("Palindrome");
        }else{
            System.out.println("not");
        }
    }
}
