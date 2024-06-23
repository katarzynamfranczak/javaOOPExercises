public class Animals {
    String name;
    String type;
    int age;
    int eyes;

    static String whatIsIt = "Animal";

    public static void main(String[] agrs) {

        Animals dog = new Animals();
        Animals cat = new Animals();

        dog.name = "Oscar";
        dog.type = "Herb";
        dog.age = 3;
        dog.eyes = 2;

        cat.name = "Fiona";
        cat.type = "straight";
        cat.age = 7;

        System.out.println("The dogs name is " + dog.name);
        System.out.println("The dogs type and " + dog.type + "age " + dog.age + " with " + dog.eyes + " eyes.");

        System.out.println("Cats name is " + cat.name);
        System.out.println("Cats type is " + cat.type + " and name " + cat.name);

        System.out.println("What is it? " + whatIsIt );

    }
}