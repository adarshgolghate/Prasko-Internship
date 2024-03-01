import java.util.*;
public class Question61 {
    //Password Strength Checker: create a program that checks the strength of the password based on certain criteria
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean specialCaracter = false;
        boolean number = false;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2'|| str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9'){
                number = true;
            }
            
        }
    }
}
