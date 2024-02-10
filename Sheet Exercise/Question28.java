import java.util.*;
public class Question28 {
    //Perimeter of a square: 4 * side = perimeter
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of your side");
        int side = scan.nextInt();
        int parameter = 4*side;
        System.out.println("Parameter of your square is:"+parameter);

    }
}
