public class Zoo {
    Animal[] animals = new Animal[10];

    private Zoo(Animal[] animals){
        this.animals = animals;
    }

    public static Zoo createZoo(Animal[] animals){
        if(!isFull(animals)) return null;
        return new Zoo(animals);
    }

    private static boolean isFull(Animal[] animals){
        for(int i = 0; i<animals.length; i++){
            if(animals[i] == null){
                return false;
            }
        }
        return true;
    }

    public void displayAnimalsInZoo(){
        for(int i = 0; i<10; i++){
            animals[i].makeSound();
            if(animals[i] instanceof RunAnimal runAnimal){
                runAnimal.run();
            }
        }
    }
}
