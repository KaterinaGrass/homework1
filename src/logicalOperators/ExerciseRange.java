package logicalOperators;

import java.util.Scanner;

public class ExerciseRange {
    //this is the entry point for our program
    public static void main(String[] args) {
        //create  a Scanner object to get valuers from the keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        //read whatever the user typed on the keyboard into the variable numberEntered
        int numberEntered = sc.nextInt();
        int number1 = -20;
        int number2 = 40;
        if (numberEntered >= number1 && numberEntered <= number2 ) {
            System.out.println("Number " + numberEntered + " belongs to a range of [" + number1 + ";" + number2 +"]");
        } else if (numberEntered < number1) {
            System.out.println("Number " + numberEntered + " belongs to a range up to " + number1);
        } else {
            System.out.println("Number " + numberEntered + " belongs to a range from " + number2);
        }
    }
}
