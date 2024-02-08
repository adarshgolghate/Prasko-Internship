//Importing the util package for accesing the scanner class
import java.util.*;
//Vowel or Consonant: Create a program that checks if a given character is a vowel or a consonant.
class Question55 {
    public static void main(String arga[]){
        //declared a variable of character type.
        char c;
        //declaring a printing statement to ask the user to enter a characater to check if it is vowel or not.
        System.out.println("Enter a character:");
        //making an object 'scan' of scanner class
        Scanner scan = new Scanner(System.in);
        c = scan.next().charAt(0);
        //running if else if condition 
        if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){  //this condition checks for the vowel of lower case
            System.out.println("The entered value is a Vowel");
        }
        else if(c == 'A' || c=='E' || c=='I' || c=='O' || c=='U'){  // this condition checks for the vowel fo upper case
            System.out.println("The entered value is a Vowel.");
        }
        else{                                                       // this condition will run if the both the if, else if condition fails
            System.out.println("The entered value is a Consonent."); 
        }
    }    
}
