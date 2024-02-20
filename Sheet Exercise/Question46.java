import java.util.*;
class Question46 {
    //Surface area of a torus: 4π^2 * R * r = surface area
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first Radius");
        int R =scan.nextInt();
        System.out.println("Enter your second radius");
        int r = scan.nextInt();
        double SurfaceArea = 4*(3.14*3.14)*R*r;
        System.out.println("Surface Area = "+SurfaceArea);
    }
    
}
