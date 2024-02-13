//importing utility package
import java.util.*;
public class Extra1 {
    public static void main(String args[]){
        //making an object of scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in between 1-7");
        //declaring a variable that will take an date entry
        byte date = scan.nextByte();
        //a string array for indexing
        String day[]={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        int x=1;
        //printing of 'day' array
        for(byte i=0;i<day.length;i++){
            System.out.print(day[i]+"\t");
        }
        //this statement will change the line
        System.out.println(" ");
        //this for loop will execute 5 times
        for(byte i=0; i<=4;i++){
             //checking the condition if the value is greater than 1 then
             if(date>1){
                 for(byte k=1; k<date; k++){
                    System.out.print("  \t"); 
            }
             date=0;
            }
            else{
                //this loop will print the dates till 30
                for(byte j=date; j<=day.length;j++ ){
                   
                    System.out.print(x +"\t");
                    x++;
                    if(x==31){
                        break;
                    }
                    else{                
                        continue;                
                    }
                } 
                System.out.println(" ");                      
            }         
        }
        
    }
}
