package cyckearray;

import java.util.Scanner;

public class GuessRiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is this: In winter and summer is one color");
        System.out.println("Enter you answer");
        String answerDown = "Christmas tree";
        int attempts = 3;
        for (int  i = 0; i < attempts; i++) {
            String answerUser = sc.nextLine();
            if (answerUser.equals(answerDown)) {
                System.out.println("You guessed");
                break;
            } else if (i != attempts-1) {
                System.out.println("This is wrong answer! Try again!");
            } else {
                System.out.println("You did not word " + answerDown + " in " + attempts + " attempts");
                System.out.println("Game over");

            }


        }
    }
}
