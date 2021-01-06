package nat;

public class Machine {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int money;

    public Machine() {
        water = 400;
        milk = 540;
        coffeeBeans = 120;
        disposableCups = 9;
        money = 550;
    }

    public void displayQuantities() {
        System.out.println("The coffee machine has: ");
        System.out.printf("%d of water%n", water);
        System.out.printf("%d of milk%n", milk);
        System.out.printf("%d of coffee beans%n", coffeeBeans);
        System.out.printf("%d of disposable cups%n", disposableCups);
        System.out.printf("%d of money%n", money);
    }

    public boolean checkForEspresso() {
        if (water < 250) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        else if (coffeeBeans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
        else if (disposableCups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
            return false;
        }

        return true;
    }

    public void buyEspresso() {

        if (checkForEspresso()) {
            water -= 250;
            coffeeBeans -= 16;
            disposableCups--;
            money += 4;
        }
    }

    public boolean checkForLatte() {
        if (water < 350) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        else if (coffeeBeans < 20) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
        else if (disposableCups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
            return false;
        }

        return true;
    }

    public void buyLatte() {
        if(checkForLatte()) {
            water -= 350;
            milk -= 75;
            coffeeBeans -= 20;
            disposableCups--;
            money += 7;
        }
    }

    public boolean checkForCappuccino() {
        if (water < 200) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        else if (coffeeBeans < 12) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
        else if (disposableCups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
            return false;
        }

        return true;
    }

    public void buyCappuccino() {
        if (checkForCappuccino()) {
            water -= 200;
            milk -= 100;
            coffeeBeans -= 12;
            disposableCups--;
            money += 6;
        }
    }

    public void fill(int water, int milk, int coffeeBeans, int disposableCups) {
        this.water += water;
        this.milk += milk;
        this.coffeeBeans += coffeeBeans;
        this.disposableCups += disposableCups;
    }

    public void take() {
        System.out.printf("I gave you $%d%n", money);
        money = 0;
    }
}
