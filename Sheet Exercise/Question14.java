//importing util package
import java.util.*;
class Question14 {
    public static void main(String args[]){
        //Average: (a + b + c + ... + n) / total number of values = average
        //I have to make it user friendly.
        //objective-1: take inputs from user so will have to make object of array.
        //Objective-2 : sum all of them.
        //Objective-3: divide them by the number of element.
        System.out.println("Enter the size of the array:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(),result=0;
        //making an object of array
        int a[] = new int[size];
        for(int i=0; i<a.length; i++)
        {
            System.out.println("Enter value at "+(i+1)+"th Position");
            a[i] = scan.nextInt();
        }
        for(int i=0; i<a.length;i++){
            result = result+a[i];
        }
        int average = result/size;
        System.out.println("The avg of the given values will be: "+ average);

    }
    
}

