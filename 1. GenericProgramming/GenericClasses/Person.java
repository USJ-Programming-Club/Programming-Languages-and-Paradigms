package GenericClasses;

public class Person implements Human {
    public void eat() {
        System.out.println("Person eats");
    }
    public <T extends Person> void kill(T character) {
        System.out.println("Fatality");
    }
}