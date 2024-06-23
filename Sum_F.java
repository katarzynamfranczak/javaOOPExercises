import java.util.Scanner;

public class Sum_F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number ");
        int a = input.nextInt();

        int facd = 1;
        int i = a;
        while (i >= 1) {
            facd *= i;
            i--;
        }
        System.out.println(facd);
    }
}
