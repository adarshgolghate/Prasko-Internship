//importing util package
import java.util.*;
class Question18 {
    public static void main(String args[]){
        //Area of a trapezoid: (base1 + base2) * height / 2 = area
        //making an object of scanner class
        Scanner scan = new Scanner (System.in);
        //decalring a statement for printing and taking value from user in the varaibles
        System.out.println("Enter the value of your base-1:");
        int base1 = scan.nextInt();
        System.out.println("Enter your value of base-2:");
        int base2 = scan.nextInt();
        System.out.println("Enter the height of your trapezoid:");
        int height = scan.nextInt();
        //calcutaing the area of trapezoid
        int area = ((base1+base2)*height)/2;
        //declaring the statement for printing the area of the trapezoid
        System.out.println("The area of your trapezoid is:"+area);
    }    
}
