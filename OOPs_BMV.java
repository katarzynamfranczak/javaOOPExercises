public class OOPs_BMV {
    String nationality = "Romanian";
    String gender = "Male";
    String name = "MV";
    String dob = "24.12.1994";
    char firstName = 'M';
    char surName = 'V';

    public static void main(String[] args) {
        OOPs_BMV baby = new OOPs_BMV("Romanian", "Male", "MV", "24.12.1994", 'M', 'V');
        baby.nationality = "Romanian";
        baby.gender = "Male";
        baby.name = "MV";
        baby.dob = "24.12.1994";
        baby.firstName = 'M';
        baby.surName = 'V';

        System.out.println(
                "The person's nationality is " + baby.nationality + " celebrating birthday on the " + baby.dob);
        displayDetails(baby);
    }

    public OOPs_BMV(String nationality, String gender, String name, String dob, char firstName, char surName) {
        this.nationality = nationality;
        this.gender = gender;
        this.name = name;
        this.dob = dob;
        this.firstName = firstName;
        this.surName = surName;
    }

    public static void displayDetails(OOPs_BMV baby) {
        System.out.println("The first character of this person name is " + baby.firstName
                + " and the first character of his surnam is " + baby.surName);
    }

}
