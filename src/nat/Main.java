package nat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Machine coffeeMachine = new Machine();
        coffeeMachine.displayQuantities();

        System.out.println();

        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String action = scanner.next();

        while (!action.equals("exit")) {

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String optionString = scanner.next();
                    if (!optionString.equals("back")){
                        int option = Integer.parseInt(optionString);
                        switch (option) {
                            case 1:
                                coffeeMachine.buyEspresso();
                                break;
                            case 2:
                                coffeeMachine.buyLatte();
                                break;
                            case 3:
                                coffeeMachine.buyCappuccino();
                                break;
                        }
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    int amountOfWater = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    int amountOfMilk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int amountOfCoffeeBeans = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int amountOfDisposableCups = scanner.nextInt();
                    coffeeMachine.fill(amountOfWater, amountOfMilk, amountOfCoffeeBeans, amountOfDisposableCups);
                    break;
                case "take":
                    coffeeMachine.take();
                    break;
                case "remaining":
                    coffeeMachine.displayQuantities();
                    break;
            }
            System.out.println();

            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            action = scanner.next();

        }

    }

}
