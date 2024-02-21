import java.util.*;
public class BubbleSort {
    //sort an array using bubble sort
    public static void main(String args[]){
          //initializing of array...
        int a[]= new int[10];
        for(int i=0; i<a.length;i++){
            Scanner scan = new Scanner(System.in);
            System.out.print("ENTER A VALUES:");
            a[i]=scan.nextInt();
        }
        for(int i=0; i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }                
            }            
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
