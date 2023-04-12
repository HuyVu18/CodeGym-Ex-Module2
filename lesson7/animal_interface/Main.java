package lesson7.animal_interface;

import lesson7.animal_interface.animal.Animal;
import lesson7.animal_interface.animal.exrtends.Chicken;
import lesson7.animal_interface.animal.exrtends.Tiger;
import lesson7.animal_interface.edible.Edible;
import lesson7.animal_interface.edible.impl.Apple;
import lesson7.animal_interface.edible.impl.Fruit;
import lesson7.animal_interface.edible.impl.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howtoEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        System.out.println();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
