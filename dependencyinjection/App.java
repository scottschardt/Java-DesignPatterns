public class App{
    public static void main(String args[]){

        Vehicle myCar = new Vehicle(new SmallEngine(500));

        myCar.crankIgnition();
    }
}