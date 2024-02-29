import java.util.*;
public class Question113 {
    //Check if the given character is a vowel or an consonant using switch case and loop
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean x = true;
        while(x==true){
            System.out.println("Enter a character : ");
            char ch = scan.next().charAt(0);
            switch (ch) {
                case 'a':System.out.println("Vowel");break;
                case 'e':System.out.println("Vowel");break;
                case 'i':System.out.println("Vowel");break;
                case 'o':System.out.println("Vowel");break;
                case 'u':System.out.println("Vowel");break;
                case 'A':System.out.println("Vowel");break;
                case 'E':System.out.println("Vowel");break;
                case 'I':System.out.println("Vowel");break;
                case 'O':System.out.println("Vowel");break;
                case 'U':System.out.println("Vowel");break;            
                default:System.out.println("Consonent");break;
            }
            System.out.println("Do you want to check more characte : ");
            System.out.println("Press 1 for yes");
            System.out.println("Press 2 for No");
            byte option = scan.nextByte();
            if(option == 1){
                x =true;
            }
            else{
                x=false;
            }
        }
        

    }
}
