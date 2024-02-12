import java.util.*;
public class Question59 {
    //Smallest among five number: Write a program that finds the smallest among five numbers.
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any five number");
        int a[] = new int[5];
        for(int i=0;i<5;i++){
            a[i]=scan.nextInt();
        }
        int min=0;
        for(int i=1; i<5; i++){
            if(a[i-1]>a[i]){
                min=a[i];
            }
        }
        System.out.print("The smallest number is "+min);

        
    }
}
