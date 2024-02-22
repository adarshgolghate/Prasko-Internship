import java.util.*;
public class MatrixMultiplication {
    //WRITE A PROGRAM TO MULTIPLY THE MATRIX
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
         //TAKING ELEMENT IN AN MATRIX 'A'
         System.out.println("ENTER THE VALUE IN MATRIX 'A'");
         System.out.println(" ");
         for(int i=0; i<a.length; i++){
             for(int j=0; j<a.length; j++){
                 a[i][j] = scan.nextInt();
             }
             System.out.println(" ");
         }
         //TAKING ELEMENT IN AN MATRIX 'B'
         System.out.println("Enter value in matrix 'B' ");
         for(int i=0; i<b.length;i++){
             for(int j=0; j<b.length; j++){              
                
                 b[i][j]=scan.nextInt();
             }
             System.out.println(" ");
         }
         System.out.println("Printing of Matrix A");
         System.out.println(" ");
         //PRINTING OF MATRIX 'A'
         for(int i=0; i<a.length; i++){
             for(int j=0; j<a.length; j++){
                 System.out.print(a[i][j]+"\t");
             }
             System.out.println(" ");
         }
         System.out.println("Printing of Matrix B");
         System.out.println(" ");
         //PRINTING OF MATRIX 'B'
         for(int i=0; i<b.length; i++){
             for(int j=0; j<a.length; j++){
                 System.out.print(b[i][j]+"\t");
             }
             System.out.println(" ");
         }
         //MULTIPLYING A*B
         for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
               c[i][j] = 0;

                // Dot product calculation
                for (int k = 0; k < 3; k++) {
                c[i][j] += a[i][k] * b[k][j];
                }
       
            }
         }
         for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
