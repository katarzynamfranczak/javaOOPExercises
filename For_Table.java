import java.util.Scanner;
public class For_Table {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a table number : ");
        int a = input.nextInt();
        int i;
        for(i=1; i<=10; i++){
            System.out.println(i + " x " + a + " = " + (i * a));
        }
        }
}
