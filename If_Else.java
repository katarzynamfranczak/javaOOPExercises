import java.util.*;

public class If_Else {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter number a ");
        int a = input.nextInt();
        System.out.printf("Enter number b ");
        int b = input.nextInt();
        System.out.printf("Enter number c ");
        int c = input.nextInt();

        if(a>=b && a<= c){
            System.out.println("The number a is the biggest ");
        }
        else if (b>= c){
            System.out.println(" The number b is the biggest ");
        }
        else {
            System.out.println("The number c is the largest");
        }

    }
}
