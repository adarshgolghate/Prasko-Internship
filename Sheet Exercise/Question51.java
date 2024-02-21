import java.util.*;
public class Question51 {
    //surface area of a icosahedron: 5*sqrt3*edge*edge = surface area
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the edge...");
        int edge = scan.nextInt();
        double SrufaceArea = (5*Math.sqrt(3))*(edge*edge);
        System.out.print("The surface area of Icosahedron = "+SrufaceArea);
    }
}
