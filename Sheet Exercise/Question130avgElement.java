import java.util.*;
public class Question130avgElement {
    //find the average of array element
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array...");
        int n = scan.nextInt();        
        int a[] = new int[n];
        for(int i =0; i<a.length; i++){
           System.out.print("Enter a number");
            a[i]= scan.nextInt();
        }
        int sum = 0;
        for(int i=0 ; i<a.length; i++){
            sum = sum+a[i];
        }
        int avg = sum/n;
        System.out.println("Average of an number = "+avg);
    }
}
