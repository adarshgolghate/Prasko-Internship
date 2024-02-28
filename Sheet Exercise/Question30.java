import java.util.*;
public class Question30 {
    //Pythagorean theorem: a^2 + b^2 = c^2
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three values");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int result = (a*a)*(b*b);
        c = c*c;
        if(result == c){
            System.out.print("It is a pythagorean Theorem");
        }
        else{
            System.out.print("It is not a pythagorean theorem");
        }

    }
}
