//importing package
import java.util.*;
public class Question76 {
    /*
       A program to display the type of a shape based on the number of sides.
       Ex: input -> 4, Output: rectangle. 
       input: -> 3, output: triangle.
     */
    public static void main(String args[]){
        //making object of scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sides does your shape has?");
        int a = scan.nextInt();
        //switching in between conditions
        switch (a) {
            case 0: System.out.println("Your shape is a circle.");break;
            case 1: System.out.println("It's not a shape it is a Line.");break;
            case 3: System.out.println("Your shape is a Triangle.");break;
            case 4: System.out.println("Your shape is a Square.");break;
            case 5: System.out.println("Your shape is a Pentagon");break;
            case 6: System.out.println("Your shape is Hexagon");break;
            case 8: System.out.println("Your shape is an Octagon");break;
            default: System.out.println("Not a shape");break;   
            
        }
    }
}
