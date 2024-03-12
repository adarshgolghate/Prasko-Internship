import java.util.*;
public class Question142 {
    //Insert a element at a specific position in an array
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int  a[] = {10,20,30,40,50};
        for(int  i =0; i<a.length; i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println(" ");
        System.out.print("Choose the position to enter the number");
        int n = scan.nextInt() ;
        System.out.println(" ");
        System.out.print("Enter the value");
        a[n-1]= scan.nextInt();

        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+"\t");
        }        
    }
}
