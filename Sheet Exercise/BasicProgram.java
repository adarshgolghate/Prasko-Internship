//importing util package so that we can use scanner class to take input from the user
import java.util.*;
//making an extra class to stack up all the code at once
class AllProgram{
    //this method demostratest  the formula a2-b2 = (a+b)(a-b)
    void formula1(){
        //declared 3 variable in which a and b are the two number that will take the value from the user and result is the output of the operations performed on them.
        int a,b,x,y,result;
        //made a scanner object 'scan' to let the user give input
        Scanner scan = new Scanner(System.in);
        //this allows the user to give the value to a and b.
        System.out.println("Enter 1st value");
        a = scan.nextInt();
        System.out.println("Enter 2nd value");
        b= scan.nextInt();                
        result = (a+b)*(a-b);        
        System.out.println("The output of" +a+"^2"+"-"+b+"^2 = " + result);
    }
    //this method demostrates the formula (a+b)2 = a2+2ab+b2
    void formula2(){
        //made a scanner object 'scan' to let the user give input
        Scanner scan = new Scanner(System.in);
        //declaring the variables
        int a,b,result;
        //user entering  the value in the variable
        System.out.println("Enter the 1st number");
        a = scan.nextInt();
        System.out.println("Enter the 2nd number");
        b = scan.nextInt();
        result = (a*a)+(2*a*b)+(b*b);
        System.out.println("The output of ("+a+"+"+b+") = " + result);
    }
    //a2+ b2 = (a + b)2 – 2ab
    void formula3(){        
        //made a scanner object 'scan' to let the user give the input
        Scanner scan = new Scanner(System.in);
        //decalring the variable
        int a,b,result;
        //user entering the value in the varibale
        System.out.println("Enter the 1st number");
        a = scan.nextInt();
        System.out.println("Enter the 2nd number");
        b = scan.nextInt();
        result = (a+b)*2 - 2*a*b;
        System.out.println(result);    
    }
    //(a-b)^2 = a^2-2ab+b^2
    void formula4(){        
        //making a object of scanner class 
        Scanner scan = new Scanner(System.in);
        //decalraing the variables
        int a,b,result;
        //asking user to enter a number
        System.out.println("Enter 1st Number:");
        a = scan.nextInt();
        System.out.println("Enter 2nd Number:");
        b= scan.nextInt();
        result = (a*a)-(b*b)-2*a*b;
        System.out.println("The output of this formula will be :" + result);
    }
    //(a + b + c)2 = a2 + b2 + c2 + 2ab + 2bc + 2ca
    void formula5(){
        //making a object of scanner class 
        Scanner scan = new Scanner(System.in);
        //decalraing the variables
        int a,b,c,result;
        //asking user to enter a number
        System.out.println("Enter 1st Number:");
        a = scan.nextInt();
        System.out.println("Enter 2nd Number:");
        b= scan.nextInt();
        System.out.println("Enter 3nd Number:");
        c= scan.nextInt();
        result= (a*a)+(b*b)+(c*c)+(2*a*b)+(2*b*c)+(2*c*a);
        System.out.println("The out put for the given values will be:" + result);
    }
    //(a – b – c)2 = a2 + b2 + c2 – 2ab + 2bc – 2ca
    void formula6(){
        //making a object of scanner class 
        Scanner scan = new Scanner(System.in);
        //decalraing the variables
        int a,b,c,result;
        //asking user to enter a number
        System.out.println("Enter 1st Number:");
        a = scan.nextInt();
        System.out.println("Enter 2nd Number:");
        b= scan.nextInt();
        System.out.println("Enter 3nd Number:");
        c= scan.nextInt();
        result = (a*a)+(b*b)+(c*c)-(2*a*b)+(2*b*c)-(2*c*a);
        System.out.println("The out put for the given values will be:" + result);
    }
    //(a + b)3 = a3 + 3a2b + 3ab2 + b3
    void formula7(){
        //making a object of scanner class 
        Scanner scan = new Scanner(System.in);
        //decalraing the variables
        int a,b,result;
        //asking user to enter a number
        System.out.println("Enter 1st Number:");
        a = scan.nextInt();
        System.out.println("Enter 2nd Number:");
        b= scan.nextInt();
        result = (a*a*a) + (3*(a*a)*b) + (3*a*(b*b)) + (b*b*b);
        System.out.println("The out put for the given value will be:" + result);
    }
    //(a – b)3 = a3 – 3a2b + 3ab2 – b3
    void formula8(){
        //making a object of scanner class 
        Scanner scan = new Scanner(System.in);
        //decalraing the variables
        int a,b,result;
        //asking user to enter a number
        System.out.println("Enter 1st Number:");
        a = scan.nextInt();
        System.out.println("Enter 2nd Number:");
        b= scan.nextInt();
        result = (a*a*a) - (3*(a*a)*b) + (3*a*(b*b)) - (b*b*b);
        System.out.println("The out put for the given value will be:" + result);
    }
    //a3 – b3 = (a – b)(a2 + ab + b2)
    void formula9(){
        //making a object of scanner class 
        Scanner scan = new Scanner(System.in);
        //decalraing the variables
        int a,b,result;
        //asking user to enter a number
        System.out.println("Enter 1st Number:");
        a = scan.nextInt();
        System.out.println("Enter 2nd Number:");
        b= scan.nextInt();
        result = (a-b)*((a*a)+(a*b)+(b*b));
        System.out.println("The out put for the given value will be:" + result);
    }
    //a3 + b3 = (a + b)(a2 – ab + b2)
    void formula10(){
        //making a object of scanner class 
        Scanner scan = new Scanner(System.in);
        //decalraing the variables
        int a,b,result;
        //asking user to enter a number
        System.out.println("Enter 1st Number:");
        a = scan.nextInt();
        System.out.println("Enter 2nd Number:");
        b= scan.nextInt();
        result = (a+b)*((a*a)-(a*b)+(b*b));
        System.out.println("The out put for the given value will be:" + result);
    }
}
//this class is the main class
class BasicProgram{
    public static void main(String args[]){
        //printing a menu to guide the user.
        System.out.println("--------------MENU--------------");
        System.out.println("Press 1 from a2-b2");
        System.out.println("Press 2 for (a+b)2");
        System.out.println("Press 3 for a2+b2");
        System.out.println("Press 4 from (a-b)^2");
        System.out.println("Press 5 for (a + b + c)^2");
        System.out.println("Press 6 for (a - b - c)2");
        System.out.println("Press 7 for (a + b)3 ");
        System.out.println("Press 8 for (a - b)3 ");
        System.out.println("Press 9 for a3-b3 ");
        System.out.println("Press 10 for a3 + b3");

        //declared a variable index to switch in between the menu
        int index;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Choose your choice:");
        index= scan2.nextInt(); 
        //making objects of the class formula1
        AllProgram ap= new AllProgram();
        //Using switch case to 
        switch (index){
            case 1: ap.formula1(); break;
            case 2: ap.formula2(); break;     
            case 3: ap.formula3(); break;  
            case 4: ap.formula4(); break;    
            case 5: ap.formula5(); break;       
            case 6: ap.formula6(); break;
            case 7: ap.formula7(); break;
            case 8: ap.formula8(); break;
            case 9: ap.formula9(); break;
            default: System.out.println("Invalid Input"); break;
        }
    }  
    
}
