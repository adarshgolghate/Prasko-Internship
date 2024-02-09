//importing util package
import java.util.*;
class Question22 {
    //Perimeter of a regular hexagon: 6 * s, where s is the side length
    public static void main(String args[]){
        //making object of scanner class
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the side of your hexagon:");
        int sides = scan.nextInt();
        int parameter = 6*sides;
        System.out.println("The Parameter of your hexagone = "+parameter);

    }
    
}
