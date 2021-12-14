package tuan1;

public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        int MAX_DENOMITATOR = 1000;
        for (int denominator = 1; denominator<MAX_DENOMITATOR; denominator+=2){
            if (denominator%4 ==1){
                sum+= denominator;
            }else if(denominator%4 == 3){
                sum-=denominator;
            }else {
                System.out.println("impossible!!!");
            }
        }
        System.out.println(sum);
    }
}
