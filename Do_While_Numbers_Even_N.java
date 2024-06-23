import java.util.Scanner;
public class Do_While_Numbers_Even_N{
    public static void main(String[] args){
    System.out.printf("Enter the last number : ");
Scanner in = new Scanner (System.in);
int n= in.nextInt();
int i = 2;
do{
    System.out.println(i);
    i++;
    i++;
}
while(i<n);
    }
}