import java.util.Scanner; 

public class To_Power {
    public static int calBasePower(int base, int power){ // two parameter base and power

        int answe = 1;// var answer will have value 1 

        for( int i=1; i<= power; i++);// then we go to the loop, loop var is i, the i will run until the power, 
        {
            answer *= base; // answer = answe x base
        }

        return answer;


    }

    public static void main(String [] args){ // start in main


    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter the base and power :" );
    int b = sc.nextInt(); // in the memory b with space and user will enter the value 
    int p = sc.nextInt(); // is a var the user withh enter a value

    int result = calBasePower(b, p); // var result thi will shift ups to callBasePower
    System.out.println(result);

    }

}
