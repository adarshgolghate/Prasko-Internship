import java.util.*;
public class SelectionSort {
    //write a program to implement slections sort
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a[]={30,50,60,90,10};
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
        //printing of array
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
