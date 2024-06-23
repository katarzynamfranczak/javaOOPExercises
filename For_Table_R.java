import java.util.Scanner;

public class For_Table_R {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter table number : ");
        int a = input.nextInt();
        int i;

        for (i = 10; i >= 1; i--) {
            System.out.println(i + " x " + a + " = " + (i * a));
        }
    }
}