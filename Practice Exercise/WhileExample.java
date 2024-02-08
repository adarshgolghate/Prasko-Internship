//made a class
class WhileExample {
    //declared a method
    public static void main (String args[])
    {
        //initialized a variable
        int x = 1;
        //declared a statement for printing the current value of x
        System.out.println("The value of x before loop is:" + x);
        //running the while loop till the value of x if less than 4
        while(x<4)
        {
            System.out.println("In while loop");
            System.out.println("The value of x in loop is:" +x);
            //adding one to the previous value of the x
            x=x+1;
        }
        //decalred a statement for the printing the final value of x 
        System.out.println("The value of x after loop is:"+x);

    }
    
}
