public class CoffeeShop {
    public static void main(String args[]){
        Customer scott = new Customer("Scott Schardt", "black coffee");
        Customer claire = new Customer("Claire Chase", "carmel machiato");
        CoffeeAttendant gabe = new CoffeeAttendant();

        gabe.takeOrder(scott);
        gabe.takeOrder(claire);
        gabe.prepareDrink(scott.getDrinkOrdered());
        gabe.prepareDrink(claire.getDrinkOrdered());
        gabe.callOutCompletedOrder();
    
    }
}