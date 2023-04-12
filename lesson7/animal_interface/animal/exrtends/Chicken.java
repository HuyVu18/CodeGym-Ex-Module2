package lesson7.animal_interface.animal.exrtends;

import lesson7.animal_interface.animal.Animal;
import lesson7.animal_interface.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cook cook";
    }

    @Override
    public String howtoEat() {
        return "nhoam nhoaammmmmm";
    }
}
