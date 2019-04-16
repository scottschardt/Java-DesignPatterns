public class Sparrow extends Bird implements Flyable{
    public Sparrow(int weight){
        super(weight);
    }

    public void fly() {
        System.out.println("Sparrow flying high...");
    }
}    