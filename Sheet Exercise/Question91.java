import java.util.*;
public class Question91 {
    //calculate the average of N number
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Nth number");
        int n = scan.nextInt();
        int sum = 0;
        double avg =0;
        for(int i=1; i<=n; i++){
            sum =sum+i;
        }
        avg = sum/n;
        System.out.println(avg);

    }   
}
