package tuan1;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double count = 0;
        for (int index = 1; index <= 100; index++){
            sum+=index;
            count++;
        }
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + sum/count);
    }
}
