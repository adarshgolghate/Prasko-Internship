//practicing objects 
class Movie {
    //made 3 instance variables
    String title;
    String geren;
    int x;
    
    //made an method
    void playit()
    {
        //printing an statement that denotes that a movie is being played
        System.out.println("The movie is playing");
    }

    public static void main (String args[])
    {
        //made first object
        Movie one = new Movie();
        one.title="Jawan";
        one.geren="Action";
        one.x=5;
        one.playit();
        //made second object
        Movie two = new Movie();
        two.title="Pathan";
        two.geren="Action";
        two.x=5;
        two.playit();
        //made third object
        Movie three = new Movie();
        three.title="Indian Police Force";
        three.geren="Action";
        three.x=4;
        three.playit();
    }
    
}
