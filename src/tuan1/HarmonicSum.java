package tuan1;

public class HarmonicSum {
    public static void main(String[] args) {
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        final int max_DENOMINATOR = 50000;
        double absDiff;
        for (int denominator = 1; denominator <= max_DENOMINATOR; denominator++){
            sumL2R += 1/denominator;
        }
        System.out.println("the sum from left to right is: "+ sumL2R);
        for (int denominator = max_DENOMINATOR; denominator >0; denominator--){
            sumR2L += 1/denominator;
        }
        System.out.println("the sum from right to left is: "+ sumR2L);
        if (sumL2R > sumR2L || sumL2R < sumR2L){
            System.out.println("false");
        }else {
            System.out.println("true");
        }
    }
}
