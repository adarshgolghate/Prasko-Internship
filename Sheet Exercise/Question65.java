import java.util.*;
public class Question65 {
    //write a program to classify the character into lower case, uper case and special symbol
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character  ");
        char ch = scan.next().charAt(0);
        if(ch>60 && ch<90){
            System.out.print("Uppper Case");
        }
        else if(ch>97 && ch<122){
            System.out.print("Lower Case");
        }
        else{
            System.out.print("Special Symbol");
        }
    }
}
