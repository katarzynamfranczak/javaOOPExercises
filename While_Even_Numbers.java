import java.util.Scanner;
public class While_Even_Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter start number : ");
        int s = input.nextInt();
        System.out.printf("Enter end number : ");
        int e = input.nextInt();
        for(int s = 1; s<=e; s++){
            if(s%2==0){
            System.out.println(s);
         }
        }
    }
}
