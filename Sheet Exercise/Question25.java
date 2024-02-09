import java.util.*;
class Question25 {
    public static void main(String args[]){
        //Perimeter of a rectangle: 2 * (length + width) = perimeter
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle:");
        int length = scan.nextInt();
        System.out.println("Enter the width of your rectangle:");
        int width = scan.nextInt();
        int parameter = 2*(length*width);
        System.out.println("The parameter of your rectangle is:"+parameter);
    }    
}
