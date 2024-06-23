public class OOPs_Pen {

    String type;
    String colour;
    int size;
    int point;

    static String objectName = "pen";
    static String factoryName = "Parker";
    static boolean click = true;

    public static void click() {
        click = true;
        if (click == true) {
            System.out.println("Object can click.");
        }
    }

    public static void main(String[] args) {
        OOPs_Pen pen1 = new OOPs_Pen("BallPoint", "Black", 23, 10);
        OOPs_Pen pen2 = new OOPs_Pen("Gel Pen", "Blue", 5, 8);

        pen1.type = "BallPoint pen";
        pen1.colour = "Black";
        pen1.size = 23;
        pen1.point = 10;

        pen2.type = "Gel Pen";
        pen2.colour = "Blue";
        pen2.size = 5;
        pen2.point = 8;

        System.out.println("This object is a " + '\n' + objectName);
        System.out.println("The object's colour is " + pen1.colour);
        displayDetails(pen1);
    }

    public OOPs_Pen(String type, String colour, int size, int point) {
        this.type = type;
        this.colour = colour;
        this.size = size;
        this.point = point;
    }

    public static void displayDetails(OOPs_Pen pen) {
        System.out.println("Type " + pen.type);
        System.out.println("Colour " + pen.colour);
    }
    
}
