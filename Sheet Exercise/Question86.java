import java.util.*;
public class Question86 {
    //find the largest element in an array
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        byte n=scan.nextByte();
        int a[] = new int[n];
        int max=0;
        for(byte i=0; i<a.length;i++){
            a[i]=scan.nextInt();
        }
        for(byte i=0; i<a.length-1; i++){
            System.out.println( (i-1) +","+ i);
            if(a[i]<a[i+1]){
                max=a[i+1];
            }
        }
        System.out.println("The largest element in an array is "+ max);
    }
}
