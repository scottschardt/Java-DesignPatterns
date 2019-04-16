import java.util.ArrayList;
import java.util.List;


public class CoffeeAttendant {
    ArrayList<Customer> customerList = new ArrayList();
    ArrayList<String> completedDrinks = new ArrayList();

    public void takeOrder(Customer customer){
        customerList.add(customer);
        completedDrinks.add(customer.getDrinkOrdered());
        System.out.println("Coffee Attendant: Hey " + customer.getName() + " I have taken your order of " + customer.getDrinkOrdered() + " and it will be ready soon");
    }

    public void prepareDrink(String drinkToBePrepared){
        System.out.print("Barista is preparing " + drinkToBePrepared + "    ");
    }

    public void callOutCompletedOrder(){
        System.out.println("Barista calls out ready drinks");

        for(String completedDrink : completedDrinks){
            System.out.println("Order Up: " + completedDrink);
            for(Customer customer : customerList){
                customer.orderReady(completedDrink);
            }
        }
    }
}