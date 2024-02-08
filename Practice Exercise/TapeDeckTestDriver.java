class TapeDeck {
    boolean canRecord = false;
    void playTape(){
        System.out.println("Tape PLaying");
    }
    void recordTape(){
        System.out.println("tape recording");
    }
    
}
class TapeDeckTestDriver{
    public static void main(String args[])
    {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if(t.canRecord == true)
        {
            t.recordTape();
        }
    }
}
