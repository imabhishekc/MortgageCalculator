package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;     //final keyword to set the value declared in variable as constants
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in); // creating a object for memory allocation

        System.out.print("Principle:");
        int principle = scanner.nextInt(); //Taking a user input here
        System.out.print("Annual Interest Rate:");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        System.out.print("Period(years):");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage:" + mortgageFormatted);
    }

}
