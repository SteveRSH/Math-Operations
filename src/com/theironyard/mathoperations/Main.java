package com.theironyard.mathoperations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //changed int to String because I was getting the numbers as a string
        String x;
        String y;
        double a;
        double s;
        double d;
        double m;
        double r;

        System.out.println("Enter two integers to calculate their answer ");
        // this is your scanner
        Scanner in = new Scanner(System.in);
        // this is the first input from the user.  you want to bring in a string
        x = in.nextLine();
        y = in.nextLine();
        // once you have the inputs as strings use parseDouble to convert to a double.
//        Double.parseDouble(in.nextLine(" ", "."));
        double firstNumber = Double.parseDouble(x);
        double secondNumber = Double.parseDouble(y);
//        double thirdNumber = Double.parseDouble(w);

        a = firstNumber + secondNumber;
        s = firstNumber - secondNumber;
        d = firstNumber / secondNumber;
        m = firstNumber * secondNumber;
        r = firstNumber % secondNumber;
        showresults(a, s, d, m, r);
    }

    static void showresults (double a, double s, double d, double m, double r) {

        System.out.println("Sum of entered integers = "+a);
        System.out.println("Subtract of entered integers = "+s);
        System.out.println("Divide of entered integers = "+d);
        System.out.println("Multiple of entered integers = "+m);
        System.out.println("Remainder of entered integers = "+r);
    }
}
