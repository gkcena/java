  import java.util.Scanner;

public class AirplaneTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, km, tripType;
        boolean isError = false;
        double discount;


        System.out.print("Please enter your age: ");
        age = input.nextInt();

        System.out.print("Enter the type of trip (1 => One Way, 2=> Round Trip): ");
        tripType = input.nextInt();

        System.out.print("Enter the distance in km type: ");
        km = input.nextInt();

        double price = km * (0.10);

        if (0 < tripType && tripType < 3) {
            if (age > 0 && km > 0) {
                if (age < 12) {
                    discount = price / 2;
                    price -= discount;

                } else if (12 <= age && age <= 24) {
                    discount = price / 10;
                    price -= discount;
                } else if (age >= 65) {
                    discount = price * (3 / 10);
                    price -= discount;
                }
                if (tripType == 2) {
                    discount = price / 5;
                    price -= discount;
                    price *= 2;
                }


            } else {
                isError = true;
            }

        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("You Entered Incorrect Data !");
        } else {
            System.out.println("Total price: " + price + " TL");
        }

    }
}
