package logicalOperators;

import java.util.Scanner;

public class ExerciseArithmetic {
    //this is the entry point for our program
    public static void main(String[] args) {
        //create a Scanner object to get values from the keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        //read whatever the user typed on the keyboard into the variable numbers
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if (number1 > number3) {
            if (number3 > number2) {
                System.out.println("The smallest number of: " + number1 + "," + number2 + "," + number3);
                System.out.println("Answer: " + number2);
            } else {
                System.out.println("The smallest number of: " + number1 + "," + number2 + "," + number3);
                System.out.println("Answer: " + number3);

            }
        } else {
            if (number1 > number2) {
                System.out.println("The smallest number of: " + number1 + "," + number2 + "," + number3);
                System.out.println("Answer: " + number2);

            } else {
                System.out.println("The smallest number of: " + number1 + "," + number2 + "," + number3);
                System.out.println("Answer: " + number1);
            }
            if (number1 > number2) {
                if (number1 > number3) {
                    System.out.println("The largest number of " + number1 + "," + number2 + "," + number3);
                    System.out.println("Answer: " + number1);

                } else {
                    System.out.println("The largest number of " + number1 + "," + number2 + "," + number3);
                    System.out.println("Answer: " + number3);

                }
            } else {
                if (number2 > number3) {
                    System.out.println("The largest number of " + number1 + "," + number2 + "," + number3);
                    System.out.println("Answer: " + number2);

                } else {
                    System.out.println("The largest number of " + number1 + "," + number2 + "," + number3);
                    System.out.println("Answer: " + number3);

                }
            }
            int average = (number1 + number2 + number3) / 3;
            System.out.println("The average arithmetic: " + number1 + "," + number2 + "," + number3);
            System.out.println("Answer: " + average);

        }


    }
}
