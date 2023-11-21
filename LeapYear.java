import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leapYear;
        boolean isLeapYear = true;

        System.out.print("Enter a year: ");
        leapYear = input.nextInt();

        if (leapYear % 4 == 0){
            if (leapYear % 100 == 0){
                if (leapYear % 400 == 0){
                }else {
                    isLeapYear = false;
                }
            }else {
            }
        }else {
            isLeapYear = false;
        }

        if (isLeapYear){
            System.out.println(leapYear + " is a leap year.");
        }else {
            System.out.println(leapYear + " is not a leap year.");
        }

    }
}
