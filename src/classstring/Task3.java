package classstring;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = sc.nextLine();
        System.out.println("Enter you age");
        int age = sc.nextInt();

        Date date = new Date();
        // Display the date and time in 2 ways. Using a separator "***" indicating the current time.
        // Задали язык результата English
        System.out.printf(Locale.ENGLISH, " Hello " + name + " " + "you are" + " " + age + " " + "years old" + " today is " +
               " %1$td %1$tB %1$tY  %n%1$tH***%1$tM***%1$tS",date);
        System.out.println("__________________________");
        // Using a separator  "#" indicating the current time
        System.out.printf(" Hello " + name + " " + "you are" + " " + age + " " + "years old" + " today is " +
                "%td %tB %tY year %n%tH#%tM#%tS",date,date,date,date,date,date,date);

    }
}
