package mycomplex;
import java.util.Scanner;
public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";

        System.out.print("Enter complex number 1 ( real and imaginary part ):");

        MyComplex number1 = new MyComplex(sc.nextDouble(), sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter complex number 2 ( real and imaginary part ):");

        MyComplex number2 = new MyComplex(sc.nextDouble(), sc.nextDouble());

        sc.nextLine();

        System.out.println();

        System.out.println("Number 1 is: " + number1.toString());

        if(!number1.isReal()) str = "NOT";

        else str = "";

        System.out.println(number1.toString() + " is " + str + " a pure real number");

        if(!number1.isImaginary()) str = "NOT";
        else str = "";

        System.out.println(number1.toString() + " is " + str + " a pure imaginary number");

        System.out.println();

        System.out.println("Number 2 is: " + number2.toString());

        if(!number2.isReal()) str = "NOT";

        else str = "";
        System.out.println(number2.toString() + " is " + str + " a pure real number");

        if(!number2.isImaginary()) str = "NOT";
        else str = "";

        System.out.println(number2.toString() + " is " + str + " a pure imaginary number");

        System.out.println();

        if(number1.equals(number2)) str = "";
        else str = "NOT";

        System.out.println(number1.toString() + " is " + str + " equal to " + number2.toString());

        System.out.println(number1.toString() + " + " + number2.toString() + " = " + number1.addNew(number2).toString());

        sc.close();
    }
}

