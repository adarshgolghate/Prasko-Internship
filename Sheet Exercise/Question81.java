import java.util.*;
public class Question81 {
    //A program to check if the given characater is a vowel or a consonent
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character...");
        char ch = scan.next().charAt(0);
        switch (ch) {
            case 'a':System.out.print("Vowel");break;
            case 'e':System.out.print("Vowel");break;
            case 'i':System.out.print("Vowel");break;
            case 'o': System.out.println("Vowel");break;
            case 'u': System.out.print("Vowel");break;        
            default:System.out.print("Consonent");break;
        }
    }
}
