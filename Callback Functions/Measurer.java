import java.util.ArrayList;

public class Measurer implements Filter{
    
    private int counter;

    public boolean accept(ArrayList<Integer> array, int i){
        if(array.get(i)>=1000){
            return true;
        }
        else{
            return false;
        }
    }
}
