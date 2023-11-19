import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, turkish, physics, chemistry, music;
        int total = 0;

        //MATH
        System.out.print("Please enter math grade:");
        math = input.nextInt();
        if (0 <= math && math <= 100)
            total += math;

        //TURKISH
        System.out.print("Please enter turkish grade:");
        turkish = input.nextInt();
        if (0 <= turkish && turkish <= 100)
            total += turkish;

        //PHYSICS
        System.out.print("Please enter physics grade:");
        physics = input.nextInt();
        if (0 <= physics && physics <= 100)
            total += physics;

        //CHEMISTRY
        System.out.print("Please enter chemistry grade:");
        chemistry = input.nextInt();
        if (0 <= chemistry && chemistry <= 100)
            total += chemistry;

        //MUSIC
        System.out.print("Please enter music grade:");
        music = input.nextInt();
        if (0 <= music && music <= 100)
            total += music;

        double avarage = total / 5;

        System.out.println("Avarage:" + avarage);

        if (avarage >= 55) {
            System.out.print("Congratulations.");
        } else {
            System.out.println("Sorry, you failed.");
        }


    }
}
