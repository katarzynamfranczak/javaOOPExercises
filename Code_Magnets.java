public class Code_Magnets {// it shoudl print a-b  c -d 
    public static void main (String [] agrs){
        int x = 3;
        if(x>2){
            System.out.print("a");
        }
        while(x>0){
            x=x-1;
            System.out.print("-");
            break;
        }
        if(x==2){
            System.out.print("b c");
        }
        while(x>0){
            x=x-1;
            System.out.print("-");
            break;
        }
        if (x==1){
            System.out.print("d");
        }
    }
  
    }

