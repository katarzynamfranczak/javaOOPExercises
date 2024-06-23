public class OOPs_Students {
    String name;
    String surname;
    int age;
    char gender;
    String address;

    static String school = "UCL";

    public static void main(String[] args){

        OOPs_Students student1 = new OOPs_Students();
        OOPs_Students student2 = new OOPs_Students();

        student1.name = "John";
        student1.surname = "Smith";
        student1.age = 23;
        student1.gender = 'M';

        student2.name = "Kate";
        student2.surname = "Cullum";
        student2.age = 24;
        student2.gender = 'F';

        System.out.println("The student name is " + student1.name);
        System.out.println("The student name is " + student2.name);

        System.out.println("The age of student 1 is " + student1.age + ", " + student1.gender + " is the gender.");

    }

}
