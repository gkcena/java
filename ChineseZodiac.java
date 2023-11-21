import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, mod;
        String ans = "";

        System.out.print("Enter the year you were born: ");
        year = input.nextInt();

        mod = year % 12;

        switch (mod) {
            case 0:
                ans = "Monkey";
                break;
            case 1:
                ans = "Rooster";
                break;
            case 2:
                ans = "Dog";
                break;
            case 3:
                ans = "Pig";
                break;
            case 4:
                ans = "Rat";
                break;
            case 5:
                ans = "Ox";
                break;
            case 6:
                ans = "Tiger";
                break;
            case 7:
                ans = "Rabbit";
                break;
            case 8:
                ans = "Dragon";
                break;
            case 9:
                ans = "Snake";
                break;
            case 10:
                ans = "Horse";
                break;
            case 11:
                ans = "Goat";
                break;
        }
        System.out.println("Your Chinese Zodiac Sign: " + ans );

    }
}
