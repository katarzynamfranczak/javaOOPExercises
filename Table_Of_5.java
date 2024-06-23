import java.util.Scanner;

public class Table_Of_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number  ");
        int x = input.nextInt();
        int y=1;
        while (y <= 10){
        System.out.println(x + " x " + y + " = " + (y * x));
        y++;
    }
}
}