
//importing util package so that we can use scanner class to take input from the user
import java.util.*;
//making an extra class to stack up all the code at once
class AllProgram{

    //this method demostratest  the formula a2-b2 = (a+b)(a-b)
    void formula1()
    {
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
    void formula3()
    {
        //a2+ b2 = (a + b)2 – 2ab
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

}
//this class is the main class
class BasicProgram{

    public static void main(String args[]){
        //printing a menu to guide the user.
        System.out.println("--------------MENU--------------");
        System.out.println("Press 1 from a2-b2");
        System.out.println("Press 2 for (a+b)2");
        System.out.println("Press 3 for a2+b2");

        int index;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Choose your choice:");
        index= scan2.nextInt(); 

        //making objects of the class formula1
        AllProgram ap= new AllProgram();
        //Using switch case to 

        switch (index)
        {
            case 1: ap.formula1(); break;
            case 2: ap.formula2(); break;     
            case 3: ap.formula3(); break;     
        
            default: System.out.println("Invalid Input"); break;
        }


    }
    
    
}
