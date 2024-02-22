import java.util.*;
public class MatrixAddition {
    //WRITE A PROGRAM TO PERFORM ADDITION OF TWO MATRIX
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        //TAKING VALUE IN MATRIX A
        System.out.println("Enter values in matrix 'A' ");
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length; j++){
                System.out.print("Enter the value in : " );
                a[i][j]=scan.nextInt();                
            }
        }
        System.out.println(" ");
        //TAKING VALUE IN MATRIX B
        System.out.println("Enter value in matrix 'B' ");
        for(int i=0; i<b.length;i++){
            for(int j=0; j<b.length; j++){              
                System.out.print("Enter the value in ");
                b[i][j]=scan.nextInt();
            }
        }
        System.out.println(" ");
        //PRINTING OF MATRIX A
        System.out.println("Matrix A");
        System.out.println("  ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");            
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        //PRINTING OF MATRIX B
        System.out.print("Matrix B");
        System.out.println(" ");
        System.out.println(" ");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.print(b[i][j]+" ");                
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        //ADDITION OF TWO MATRIX
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length;j++){
                 a[i][j] = a[i][j]+b[i][j];
            }
        }
        //PRINTING OF THE MARTIX A+B
        System.out.println("Matrix A+B");
        System.out.println(" ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");            
            }
            System.out.println("\t");
        }
    }
}
