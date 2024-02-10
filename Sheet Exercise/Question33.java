import java.util.*;
class Question33 {
    //Surface area of a sphere: 4 * π * radius^2 = surface area
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of your sphere");
        int radius = scan.nextInt();
        double surfacearea = 4*3.14*(radius*radius);
        System.out.println("The Surface area of your sphere is = "+surfacearea);
    }
    
}
