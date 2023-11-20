import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month;
        String burc = "";
        boolean isError = false;

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        if (month >= 1 && 12 >= month) {
            if (month == 1) {
                if (day < 22) {
                    burc = "oğlak";
                } else if (22 <= day && day <= 31) {
                    burc = "kova";
                } else {
                    isError = true;
                }

            }
            if (month == 2) {
                if (day < 20) {
                    burc = "kova";
                } else if (20 <= day && day <= 28) {
                    burc = "balık";
                } else {
                    isError = true;
                }

            }
            if (month == 3) {
                if (day < 21) {
                    burc = "balık";
                } else if (21 <= day && day <= 31) {
                    burc = "koç";
                } else {
                    isError = true;
                }

            }
            if (month == 4) {
                if (day < 21) {
                    burc = "koç";
                } else if (21 <= day && day <= 30) {
                    burc = "boğa";
                } else {
                    isError = true;
                }

            }
            if (month == 5) {
                if (day < 23) {
                    burc = "boğa";
                } else if (23 <= day && day <= 31) {
                    burc = "ikizler";
                } else {
                    isError = true;
                }

            }
            if (month == 6) {
                if (day < 23) {
                    burc = "ikizler";
                } else if (23 <= day && day <= 30) {
                    burc = "yengeç";
                } else {
                    isError = true;
                }

            }
            if (month == 7) {
                if (day < 23) {
                    burc = "yengeç";
                } else if (23 <= day && day <= 31) {
                    burc = "aslan";
                } else {
                    isError = true;
                }

            }
            if (month == 8) {
                if (day < 23) {
                    burc = "aslan";
                } else if (23 <= day && day <= 31) {
                    burc = "başak";
                } else {
                    isError = true;
                }

            }
            if (month == 9) {
                if (day < 23) {
                    burc = "başak";
                } else if (23 <= day && day <= 30) {
                    burc = "terazi";
                } else {
                    isError = true;
                }

            }
            if (month == 10) {
                if (day < 23) {
                    burc = "terazi";
                } else if (23 <= day && day <= 31) {
                    burc = "akrep";
                } else {
                    isError = true;
                }

            }
            if (month == 11) {
                if (day < 22) {
                    burc = "akrep";
                } else if (22 <= day && day <= 30) {
                    burc = "yay";
                } else {
                    isError = true;
                }

            }
            if (month == 12) {
                if (day < 22) {
                    burc = "yay";
                } else if (22 <= day && day <= 31) {
                    burc = "oğlak";
                } else {
                    isError = true;
                }

            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız.");
        } else {
            System.out.println("burcunuz: " + burc);
        }

    }
}
