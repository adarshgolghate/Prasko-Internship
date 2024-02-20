import java.util.*;
public class Question47 {
    //surface area of a deadcahedron 3*sqrt25+10sqrt5*edge*edge=surface area
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of your edge");
        int edge = scan.nextInt();
        double SurfaceArea = 3*(Math.sqrt(25))+(10+Math.sqrt(5))*(edge*edge);
        System.out.println("The surface area of deadcahedron = "+SurfaceArea);
    }
}
