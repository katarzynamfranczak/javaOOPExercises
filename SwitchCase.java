public class SwitchCase {
    public static void main(String[] args) {
        char letter = 'w';
       switch(letter){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        System.out.println("vowel");
        break; 
        default: 
        System.out.println("consonant");
        break;
       }
    }
}
