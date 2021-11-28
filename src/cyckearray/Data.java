package cyckearray;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        int daysOfMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = sc.nextInt();
        System.out.println("Enter the day");
        int day = sc.nextInt();

        int monthIndex = month - 1; // since array indices are 0-based

        if (1 <= day && day <= daysOfMonth[monthIndex]) {
            System.out.println("Day exist");
        } else {
            System.out.println("Print does not exist");
        }
    }
}
