import java.util.*;
public class Question128 {
    //Initialize and print an array.
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array...");
        int n = scan.nextInt();
        int a[] = new int [n];
        //this loop takes input in an array
        for(int i=0; i<a.length; i++)
        {
            System.out.println("Enter a number at "+(i+1)+" position.");
            Scanner scan2 = new Scanner(System.in);
            a[i]= scan2.nextInt();
        }
        //this loop prints the element of the array
        for(int j=0; j<a.length; j++ )
        {
            System.out.println(a[j]);
        }

    }
    
}
