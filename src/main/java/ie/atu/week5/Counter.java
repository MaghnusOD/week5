package ie.atu.week5;

public class Counter {
    private int countvalue;

    public Counter(){
        countvalue = 0;
    }
    public Counter(int startingValue){
        if(startingValue > 5){
            countvalue = startingValue;
        }
        else
        {
            throw new IllegalArgumentException("NOT VALID NUMBER");
        }
    }

    public int increment() {
        countvalue++;
        return  countvalue;
    }
}
