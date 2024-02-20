import java.util.*;
public class Question49 {
    //Volume of icosahedron: (5*(3+sqrt5)*edge*edge*edge)/12=volume
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of your edge");
        int edge= scan.nextInt();
        double volume = (5*(3+Math.sqrt(5))*(edge*edge*edge))/12;
        System.out.println("The volume of icosahedron = " +volume);
    }
}
