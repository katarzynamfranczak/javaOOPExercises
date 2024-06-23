import java.util.Scanner;

public class While_Reverse_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int s = input.nextInt();
        System.out.print("Enter ending number : ");
        int e = input.nextInt();
        while (s >= e) {
            System.out.print(s);
            s--;
        }
    }
}
