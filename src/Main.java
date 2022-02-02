import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double cash = 1000;
        int option;
        do {
            System.out.println("1-Insert cash");
            System.out.println("2-Retirate cash");
            System.out.println("3-Consult cash");
            System.out.println("4-Exit program");
            Scanner scan = new Scanner(System.in);
            option = scan.nextInt();
            if (option == 1) {
                cash = insertCash(cash);
            } else if (option == 2) {
                cash = retirateCash(cash);
            } else if (option == 3) {
                consultCash(cash);
            } else if (option == 4) {
                System.out.println("Exiting program...");
            }


        }
        while (option != 4);
    }

    private static double insertCash(double cash) {
        System.out.println("How much cash do you want to add?");
        double addCash = insertCashToOperate();

        if (isAddCashDoubleToCashOrMore(cash * 2, addCash)) {
            System.out.println("The cash you are adding is the double of the cash you have so you can't add");
        } else {
            cash = cash + addCash;
        }
        return cash;
    }

    private static double insertCashToOperate() {

        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    private static boolean isAddCashDoubleToCashOrMore(double cashDouble, double addCash) {
        if (cashDouble <= addCash) {
            return true;
        }
        return false;
    }

    private static double retirateCash(double cash) {
        System.out.println("How much cash do you want to retirate?");
        double retirateCash = insertCashToOperate();

        if (retirateCash > cash) {
            System.out.println("You can't retirate more cash than you have");
        } else {
            cash = cash - retirateCash;
        }
        return cash;
    }

    private static void consultCash(double saldo) {
        System.out.println("The cash you have in your account is: " + saldo);
    }
}
