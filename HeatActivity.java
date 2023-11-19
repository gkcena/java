import java.util.Scanner;

public class HeatActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the temperature?");
        int heat = input.nextInt();

        if (heat < 5) {
            System.out.println("ski");
        } else if (5 <= heat && heat <= 10) {
            System.out.println("cinema");
        } else if (10 <= heat && heat <= 15) {
            System.out.println("cinema or picnic");
        } else if (15 <= heat && heat <= 25) {
            System.out.println("picnic");
        } else {
            System.out.println("swim");
        }


    }
}
