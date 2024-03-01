import java.util.*;
public class Question71 {
    //Check is a number is a duck number
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        String str = scan.nextLine();
        boolean x = false;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='0'){
               x = true;
               break;
            }
            else{
                x=false;
            }
        }
        if(x==true){
            System.out.println("Duck Number");
        }
        else{
            System.out.println("Not a Dcuk Number");
        }
    }
}
