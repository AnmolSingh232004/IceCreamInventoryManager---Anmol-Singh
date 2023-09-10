import java.util.HashMap;
import java.util.Map;

public class IceCreamInventory {


    class IceCreamFlavor { //nested class
        Map<String, Integer> flavorNameAndQuantity = new HashMap<>(); // used Map-HashMap because we had 2 key value pairs
        Map<String, Integer> toppingsAndPrices = new HashMap<>();

        /*public IceCreamFlavor(Map<String, Integer> flavorNameAndQuantity, Map<String, Integer> toppingsAndPrices){
           this.flavorNameAndQuantity = flavorNameAndQuantity;
            this.toppingsAndPrices = toppingsAndPrices;
        }*/
        public IceCreamFlavor(String flavor, Integer quant, String topp, Integer price) { //constructor of nested class
            flavorNameAndQuantity.put(flavor, quant);
            toppingsAndPrices.put(topp, price);
        }
        public void addToppings(String topping, Integer prices) { //method to add toppings and prices into hash map and String and Integer
            toppingsAndPrices.put(topping, prices);
        }
        public void addFlavorNameAndQuantity(String flavor, Integer quan) {//similar
            flavorNameAndQuantity.put(flavor, quan);
        }

        public void getFlavorNameAndQuantity() { //prints flavorNameAndQuantity
            for (String s : flavorNameAndQuantity.keySet()) {
                System.out.println("Flavor name is : " + s.toUpperCase() + " Quantity of the flavor is " + flavorNameAndQuantity.get(s) + "Kg");
            }
        }
            public void getToppingsAndPricesDetails() { //prints toppingsNameAndPrices
                for(String s : toppingsAndPrices.keySet()){
                    System.out.println("Topping name is : " + s.toUpperCase() + " Price per serving is " + toppingsAndPrices.get(s));
                }
            }
        }
    } // CONCLUSION NESTED CLASSES SUCK AND JUST MAKES CODE MORE COMPLEX #BAN NESTED CLASSES







