public class OddOrEven {
    public static void main(String[] args) {
        int number = 1;
        switch (number % 2) {
            case 0:
                System.out.println("number is even");
                break;
            case 1:
                System.out.println("number is odd");
                break;
        }
    }
}
