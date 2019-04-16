public class Zoo {
    public static void main(String args[]){

        Animal sparrow = new Sparrow(15);
        Chicken chicken = new Chicken(33);
        Fish fish = new Fish(2);

    

        moveAnimal(fish);
        moveAnimal(sparrow);
        moveAnimal(chicken);
    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }
}

