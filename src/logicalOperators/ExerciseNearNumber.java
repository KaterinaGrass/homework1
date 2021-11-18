package logicalOperators;

import java.util.Scanner;

public class ExerciseNearNumber {
    //this is the entry point for our program
    public static void main(String[] args) {
        //create a Scanner object to get valuers from the keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        //read whatever the user typed on the keyboard into the variable numberEntered
        int numberEntered = sc.nextInt();
        int givenNumber = 50;
        double tenPercent1 = givenNumber + (givenNumber * 0.1);
        double tenPercent2 = givenNumber - (givenNumber * 0.1);
        if (numberEntered <= tenPercent1 && numberEntered >= tenPercent2) {
            System.out.println("The entered number next to the: " + givenNumber);
        } else {
            System.out.println("The entered number far from: " + givenNumber);
        }
    }
}
