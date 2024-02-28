import java.util.*;
public class Question91 {
    //calculate the average of N number
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Nth number");
        int n = scan.nextInt();
        int sum = 0;
        int avg =0;
        for(int i=0; i<n; i++){
            sum =sum+i;
        }
        avg = sum/2;
        System.out.println(avg);

    }   
}
