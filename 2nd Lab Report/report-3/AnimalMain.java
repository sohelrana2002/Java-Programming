import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal("Cat", "Fish");
        System.out.println("Animal name: " + animal.getAnimalName());
        System.out.println("Favorite food: " + animal.getFood());
        System.out.println(animal.toString());

        System.out.print("Enter animal name: ");
        String animalName = sc.nextLine();

        System.out.print("Enter favorite food: ");
        String food = sc.nextLine();

        animal.setAnimalName(animalName);
        animal.setFood(food);

        System.out.println("Animal name: " + animal.getAnimalName());
        System.out.println("Favorite food: " + animal.getFood());
        System.out.println(animal.toString());
    }
}
