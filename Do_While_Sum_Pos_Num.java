import java.util.Scanner;
public class Do_While_Sum_Pos_Num {
    public static void main(String[] args){
        System.out.printf("enter start number : ");
        Scanner input = new Scanner (System.in);
        int s = input.nextInt();
        System.out.printf("enter ending number : ");
        int e = input.nextInt();
        do{
            System.out.println(s + e);
            s++;
        }
        while(s<=e);
    }
}
