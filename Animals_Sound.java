public class Animals_Sound {
    String name;
    String type;
    int age;

    static String whatIsIt = "Animal";

    public Animals_Sound(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
    }

    public void makeSound() {
        System.out.println("Animal sound: *makes generic animal sound*");
    }

    public static void main(String[] args) {
        Animals_Sound dog = new Animals_Sound("Oscar", "Herb", 3);
        Animals_Sound cat = new Animals_Sound("Fiona", "straight", 7);

        dog.printDetails();
        dog.makeSound();

        cat.printDetails();
        cat.makeSound();

        System.out.println("What is it? It is an " + whatIsIt + ".");
    }
}
