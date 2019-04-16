public abstract class Animal {

    int weight;
    public Animal(int weight){
        this.weight = weight;
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public abstract void move();
}