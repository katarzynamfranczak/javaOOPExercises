import java.util.Scanner;
public class Do_While_Numbers_Odd_N {
    public static void main(String[] args){
        System.out.printf("Enter the maximum number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
            i++;
        }
        while(i<n && i%2==1);  
    }
}
