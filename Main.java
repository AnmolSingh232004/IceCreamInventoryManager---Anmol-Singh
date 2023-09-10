import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.util.Scanner;

public class Main { // next project I will make sure to create a main menu instead of this step by step traveling through all options
    public static void main(String[] args) {
// hashmap doesn't keep insertion order

        Scanner scan = new Scanner(System.in);
        System.out.println("Note all the quantities are in KiloGrams(KG)\n\n");
        IceCreamInventory ice = new IceCreamInventory(); // had to create this because of nested class
        IceCreamInventory.IceCreamFlavor iceCream = ice.new IceCreamFlavor("kulfi", 100, "badam", 50);
        //iceCream.getFlavorNameAndQuantity();

        //System.out.println("If you wish to add a new flavor press 1 or press 2 to skip");
        int check = 1;

        while (true) {
            System.out.println("If you wish to add a new flavor press 1 or press 2 to skip, if you wish to view current inventory press 3");
            if (scan.hasNextInt()) { //error handling(checks if user is ignorant if yes prints out invalid option dummy)
                check = scan.nextInt();
                if (check == 1) {
                    System.out.println("Enter the flavor you want to add.");
                    String flavor = scan.next();
                    System.out.println("Enter quantity you wish to be added to the stock(KG)");
                    Integer quantity = scan.nextInt();
                    System.out.println("\n\n" + flavor + " has been added to the inventory. " + "Quantity : 70Kg\n\n");
                    iceCream.addFlavorNameAndQuantity(flavor, quantity);
                    continue;
                }
                if (check == 2) {
                    System.out.println("Skipping.....\n");
                    break;
                }
                if (check == 3) {
                    iceCream.getFlavorNameAndQuantity();
                    System.out.println("\n");
                } else {
                    System.out.println("Invalid Option!!!\n");
                }
            } else {
                System.out.println("Invalid input!!! Please enter in a valid number.");
                scan.next(); //flushes the scanner of shitty input
            }
        }

        int check2 = 1;
        //commented this because had to move this in the loop so after user chooses an option he is prompted again on what action to do next
        //System.out.println("If you wish to add a new topping press 1 if you wish to skip press 2.\nIf you wish to view details about IceCream Flavours currently available press 3,\n if you wish to view details about Toppings currently available with prices press 4 ");
        while (true){
            System.out.println("If you wish to add a new topping press 1 if you wish to skip press 2.\nIf you wish to view details about IceCream Flavours currently available press 3,\nif you wish to view details about Toppings currently available with prices press 4. ");
            if(scan.hasNextInt()){
            check2 = scan.nextInt();
            if(check2 == 1){
                System.out.println("Enter the topping you want to add to the inventory.");
                String toppingToAdd = scan.next();
                System.out.println("Enter the price per serving of the topping");
                Integer pricePerTopping = scan.nextInt();
                System.out.println("\n\n" + toppingToAdd + " has been added with a price per serving of " + pricePerTopping + ".\n");
                iceCream.addToppings(toppingToAdd, pricePerTopping);
                continue;
            }
            if(check2 == 2){
                System.out.println("Skipping.....\n");
                break;
            }
            if(check2 == 3){
                iceCream.getFlavorNameAndQuantity();
                System.out.println("\n");
                continue;
            }
            if(check2 == 4) {
                iceCream.getToppingsAndPricesDetails();
                System.out.println("\n");
                continue; // unnecessary since last statement
            }
                else{
                    System.out.println("Invalid Option!!!");
                }
} else {
                System.out.println("Invalid Input!!! Please enter in a valid integer.");
                scan.next(); //flushes off shitty input
            }
            }
       System.out.println("Have a nice day!!");
        scan.close();
        }
    }
// CONCLUSION NESTED CLASSES SUCK AND JUST MAKES CODE MORE COMPLEX #BAN NESTED CLASSES
