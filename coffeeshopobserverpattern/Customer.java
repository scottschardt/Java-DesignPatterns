public class Customer implements WaitingCustomer {
    String name;
    String drinkOrdered;

    public Customer(String name, String drinkOrdered){
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }
    public String getName(){
        return this.name;
    }
    public String getDrinkOrdered(){
        return this.drinkOrdered;
    }

    public void orderReady(String preparedDrink){
        if(preparedDrink.equals(this.drinkOrdered)) {
            System.out.println(this.name + "'s order is ready.'");
            this.exit();
        }
    }

    public void exit(){
        System.out.println(this.name + " picked up the drink and left the store");
    }
}