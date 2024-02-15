import java.util.*;
public class TicTacToe {
    public static void main(String args[]){
             
        Scanner scan = new Scanner(System.in);
       byte a[] = new byte[9];
       int x=0;
       while(x<9){
            System.out.println(a[0]+" | "+a[1]+" | "+a[2]);
            System.out.println("---------");
            System.out.println(a[3]+" | "+a[4]+" | "+a[5]);
            System.out.println("---------");
            System.out.println(a[6]+" | "+a[7]+" | "+a[8]);
            System.out.println("Player one enter your choice:");
            
            //code for checking winner
            if(a[0]==1 && a[1]==1 && a[2]==1){
                System.out.println("Player 1 is winner!!!");
            }
            else if(a[3]==1 && a[4]==1 && a[5]==1){
                System.out.println("Player 1 is winner!!!");
            }
            else if(a[6]==1 && a[7]==1 && a[8]==1){
                System.out.println("Player 1 is winner!!!");
            }
            else if(a[0]==1 && a[4]==1 && a[8]==1){
                System.out.println("Player 1 is winner!!!");
            }
            else if(a[6]==1 && a[4]==1 && a[2]==1){
                System.out.println("Player 1 is winner!!!");
            }
            else if(a[0]==2 && a[1]==2 && a[2]==2){
                System.out.println("Player 2 is winner!!!");
            }
            else if(a[3]==2 && a[4]==2 && a[5]==2){
                System.out.println("Player 2 is winner!!!");
            }
            else if(a[6]==2 && a[7]==2 && a[8]==2){
                System.out.println("Player 2 is winner!!!");
            }
            else if(a[0]==2 && a[4]==2 && a[8]==2){
                System.out.println("Player 2 is winner!!!");
            }
            else if(a[6]==2 && a[4]==2 && a[2]==2){
                System.out.println("Player 2 is winner!!!");
            }
       }
;          

             
           
        
    }
}
