//Expected output of this exercise is a-b c-d
//Made class of the name Exercise2
class Exercise2 {
    //declaring a main method()
    public static void main (String args[])
    {
        //declared of variable 
        int x=3;
        //starting of loop till the value of x is greater than 0
        while(x>0){
            if(x>2){
                System.out.print("a");
            }
            x=x-1;
            System.out.print("-");
            if(x==2)
            {
                System.out.print("b c");
            }
            x=x-1;
            System.out.print("-");
            if(x==1)
            {
                System.out.print("d");
            }
            x=x-1;

        }
    }
    
}
