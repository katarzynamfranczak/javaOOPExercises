public class OOPs_Car {
    String nameFactory = "Audi";
    String colour = "Silver";
    int productionYear = 2014;
    String model = "Automatic";

    public static void main(String[] args) {
        OOPs_Car car1 = new OOPs_Car("Audi", "Silver", 2014, "Automatic");

        car1.nameFactory = "Audi";
        car1.colour = "Silver";
        car1.productionYear = 2014;
        car1.model = "Automatic";

        System.out.println("The cars facotry is " + car1.nameFactory + "\n" + "The cars colour is " + car1.colour);
        System.out.println("The car was made in " + car1.productionYear);
        displayDetails(car1);

    }

    public OOPs_Car(String nameFactory, String colour, int productionYear, String model) {
        this.nameFactory = nameFactory;
        this.colour = colour;
        this.productionYear = productionYear;
        this.model = model;

    }

    public static void displayDetails(OOPs_Car car1) {
        System.out.println("This car was made in " + car1.productionYear + " by the factory " + car1.nameFactory);
    }
}
