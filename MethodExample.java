public class MethodExample{
    public int sum (int a, int b ){

        // if written static after public 
        int res = a+b;
        return res; // this is local variable
    }
    public static void main(String [] agrs){
        MethodExample obj = new MethodExample();
        int ans = obj.sum(34, 12);

        // I don't need the object = objc MEthod obj int ans = obj would not be written

        System.out.println(ans);
    }
}