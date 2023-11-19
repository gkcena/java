import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        String currentPassword = "sifre123";

        System.out.print("Enter your username:");
        userName = input.nextLine();

        System.out.print("Enter your password:");
        password = input.nextLine();

        if (userName.equals("gkcen.a") && password.equals(currentPassword)) {
            System.out.println("Your informations are correct. You log in successfuly.");
        } else {
            System.out.println("Your information is incorrect. Would you like to change your password?(yes or no)");
            String response = input.nextLine();

            if (response.equals("yes")) {
                System.out.print("Please enter new password:");
                String newPassword = input.nextLine();

                if (newPassword.equals(password)) {
                    System.out.print("Please enter a valid password. Try again.");
                } else {
                    currentPassword = newPassword;
                    password = newPassword;
                    System.out.println("You have successfully changed your password. Log in.");
                }
            } else if (response.equals("no")) {
                System.out.println("ok");
            } else {
                System.out.println("Please give a valid answer.");
            }

        }


    }
}
