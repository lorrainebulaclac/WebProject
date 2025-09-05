import java.util.*;
public class Lorraine_Bulaclac_Q2_Act2 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner (System.in);
        
        System.out.println("=====Coffee Vending Machine=====");
        
        System.out.println("[1] Americano - Php 110.00");
        System.out.println("[2] Latte - Php 120.00");
        System.out.println("[3] Cappuccino - 125.00");
        System.out.println("[4] Espresso - 115.00");
        System.out.println("[5] Exit");
        
        System.out.println("Choose your coffee {[1],[2],[3],[4],[5]");
        int coffee = user_input.nextInt();
        
        switch (coffee){
            case 1:
                System.out.println("You chose Americano. Price: Php 110.00");
                System.out.println("Insert money: ");
                double amount = user_input.nextDouble();
                if (amount >= 110.00){
                    System.out.println("Exact payment received! No change needed Thank you. Enjoy Your coffee!");
                    if (amount > 110.00){
                        System.out.println("Your change is: Php" +(amount - 110.00));
                    }
                }else{
                    System.out.println("Insufficient amount. Transaction failed!");
                }
                break;
            case 2:
                System.out.println("You chose Latte. Price: Php 120.00");
                System.out.println("Insert money: ");
                amount = user_input.nextDouble();
                if (amount >= 120.00){
                    System.out.println("Exact payment received! No change needed Thank you. Enjoy Your coffee!");
                    if (amount > 120.00){
                        System.out.println("Your change is: Php" +(amount - 120.00));
                    }
                }else{
                    System.out.println("Insufficient amount. Transaction failed!");
                }
                break;
            case 3:
                System.out.println("You chose Cappuccino. Price: Php 125.00");
                System.out.println("Insert money: ");
                amount = user_input.nextDouble();
                if (amount >= 125.00){
                    System.out.println("Exact payment received! No change needed Thank you. Enjoy Your coffee!");
                    if (amount > 125.00){
                        System.out.println("Your change is: Php" +(amount - 125.00));
                    }
                }else{
                    System.out.println("Insufficient amount. Transaction failed!");
                }
                break;
            case 4:
                System.out.println("You chose Espresso. Price: Php 115.00");
                System.out.println("Insert money: ");
                amount = user_input.nextDouble();
                if (amount >= 115.00){
                    System.out.println("Exact payment received! No change needed Thank you. Enjoy Your coffee!");
                    if (amount > 115.00){
                        System.out.println("Your change is: Php" +(amount - 115.00));
                    }
                }else{
                    System.out.println("Insufficient amount. Transaction failed!");
                }
                break;
            case 5:
                System.out.println("Goodbye! Come back soon");
                break;
            default:
                
                user_input.close();
        }
    }
}
