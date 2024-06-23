import java.util.Scanner;
public class While_Nat_Num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter ending number  : ");
        int e = input.nextInt();
        System.out.printf("Enter starting number : ");
        int s = input.nextInt();

        while(e>=s){
            System.out.println(s);
            e--;
        }
    }
}
