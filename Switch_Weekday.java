import java.util.Scanner;

public class Switch_Weekday {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter day number : ");
        int daynum;
        daynum = input.nextInt();

        switch (daynum) {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            default:
                System.out.println("Invalid. Enter number from 0 to 6 ");
        }

    }
}
