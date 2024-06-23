import java.util.Scanner;

public class While_Natural_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter starting number : ");
        int s = input.nextInt();
        System.out.printf("Enter ending number : ");
        int e = input.nextInt();
        while (s <= e) {
            System.out.print(s);
            s++;
        }
    }
}
