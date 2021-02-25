/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This class contains the main
 */

class AnimalTest {
    public static void main(String[] args) {

        Animal animal = new Animal(" ", "  ", 10, "Male", "Cerrado", 50.00);

        Dog laika = new Dog("Dog", "Laika", 8, "Female", "House", 20);

        laika.bark();
        laika.greetHuman();
        laika.walk();
        laika.sound();
    }
}
