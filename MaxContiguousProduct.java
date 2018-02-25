public class MaxContiguousProduct {

    public static void main(String arg[]){
        int[] a={0,0,0,0};
        int sum=MaxContiguosSum(a);
        System.out.println("final "+sum);
    }

    public static int MaxContiguosSum(int[] a) {
        int product = 1, maxProduct = 1, maxContiguousProduct = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            product = a[i];
            maxProduct = product;
            for (int j = i + 1; j < a.length; j++) {
                product = product * a[j];
                if (maxProduct < product) {
                    maxProduct = product;
                }
            }
            if (maxContiguousProduct < maxProduct) {
                maxContiguousProduct = maxProduct;
            }
        }

        return maxContiguousProduct;
    }
}
