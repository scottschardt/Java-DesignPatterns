public class SmallEngine implements Engine {
    int hp;

    public SmallEngine(int hp){
        this.hp = hp;
    }

    public void startEngine(){
        System.out.println("Small engine started with " + hp + " horsepower");
    }
}