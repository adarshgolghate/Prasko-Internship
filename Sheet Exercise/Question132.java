import java.util.*;
public class Question132 {
    //search an element in an array
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array... ");
        int n = scan.nextInt();
        int a[] = new int[n];
        boolean x = false;
        for(int i=0; i<a.length; i++){
            System.out.print("Enter the number");
            a[i]= scan.nextInt();
        }
        System.out.println("Enter the element your want to earch");
        int key = scan.nextInt();
        for(int i=0; i<a.length; i++){
            if(a[i]==key){
               x=true; break;
            }
            else{
                x=false;
            }
        }
        if(x==true){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element Not Founds");
        }
        
    }
}
