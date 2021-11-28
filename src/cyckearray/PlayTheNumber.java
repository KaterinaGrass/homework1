package cyckearray;

import java.util.Random;
import java.util.Scanner;

public class PlayTheNumber {

    private static  Random random = new Random();
    private static final int MIN_BOUND = 0;
    private static final int MAX_BOUND = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Random random = new Random();

        int numberUser;
        int count = 0;
        int numberDown = random.nextInt(MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND;
        System.out.println("The program set the number from 0 to 100");
        do {
            System.out.println("Enter the number");
            numberUser = sc.nextInt();
            if (numberUser > numberDown) {
                System.out.println("Enter a number less");

            } else if (numberUser < numberDown) {
                System.out.println("Enter a number greater");
            } else {
                System.out.println("You guessed the number!");

            }
            count++;

        } while (numberUser != numberDown);
        System.out.println("Number of attempts: " + count);


    }
}