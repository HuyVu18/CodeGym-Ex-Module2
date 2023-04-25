package lesson21.factoryMethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimal("feline");
        System.out.println("Cat say: " + animal1.makeSound());

        Animal animal2 = animalFactory.getAnimal("canine");
        System.out.println("Dog say: " + animal2.makeSound());
    }


}
