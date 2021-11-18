package logicalOperators;

import java.util.Scanner;

public class ExerciseDay {
    //this is the entry point for our program
    public static void main(String[] args) {
        //create a Scanner object to get value from the keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        //read whatever the user tyred on the keyboard into the variable numberDayOfWeek
        int numberDayOfWeek = sc.nextInt();
        String day;
        //use the operator switch
        switch (numberDayOfWeek) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
            default:
                day = "There is no such day of the week";

        } // close switch operator
        System.out.println("This day on the week: "  + day);
    } // close main method
} // close class ExerciseDay
