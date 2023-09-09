import java.util.HashMap;
import java.util.Map;

public class IceCreamInventory {


    class IceCreamFlavor {
        Map<String, Integer> flavorNameAndQuantity = new HashMap<>();
        Map<String, Integer> toppingsAndPrices = new HashMap<>();

        /*public IceCreamFlavor(Map<String, Integer> flavorNameAndQuantity, Map<String, Integer> toppingsAndPrices){
           this.flavorNameAndQuantity = flavorNameAndQuantity;
            this.toppingsAndPrices = toppingsAndPrices;
        }*/
        public IceCreamFlavor(String flavor, Integer quant, String topp, Integer price) {
            flavorNameAndQuantity.put(flavor, quant);
            toppingsAndPrices.put(topp, price);
        }

        /*public void updateFlavorNameAndQuantity(Map<String, Integer> flavorAndQuan){
            this.flavorNameAndQuantity = flavorAndQuan;
        }*/
        public void addToppings(String topping, Integer prices) {
            toppingsAndPrices.put(topping, prices);
        }
        public void addFlavorNameAndQuantity(String flavor, Integer quan) {
            flavorNameAndQuantity.put(flavor, quan);
        }

        public void getFlavorNameAndQuantity() {
            for (String s : flavorNameAndQuantity.keySet()) {
                System.out.println("Flavor name is : " + s.toUpperCase() + " Quantity of the flavor is " + flavorNameAndQuantity.get(s) + "Kg");
            }
        }
            public void getToppingsAndPricesDetails() {
                for(String s : toppingsAndPrices.keySet()){
                    System.out.println("Topping name is : " + s.toUpperCase() + " Price per serving is " + toppingsAndPrices.get(s));
                }
            }
        }
    }







