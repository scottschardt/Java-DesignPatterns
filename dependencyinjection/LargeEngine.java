public class LargeEngine implements Engine {
    int hp;

    public LargeEngine(int hp){
        this.hp = hp;
    }

    public void startEngine(){
        System.out.println("Large engine started with " + hp + " horsepower");
    }
}