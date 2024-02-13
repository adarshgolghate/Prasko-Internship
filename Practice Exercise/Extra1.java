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
        if(date>7){
            System.out.print("Invalid Entery");
        }
        else{
            
                if(date>1){
                    for(int z=1;z<date;z++){
                        System.out.print(" \t");
                    } 
                                       
                }
                for(int k=1;k<31;k++){
                    System.out.print(x+"\t");
                    x++;
                    if(((k+date)-1)%7==0){
                        System.out.println(" ");  
                    }
                }                    
                
                              
                
            
        }
        
        
    }
}
