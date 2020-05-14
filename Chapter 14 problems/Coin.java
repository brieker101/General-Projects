
public class Coin
{
    //I thought this was the easiest way to make a few coins and sort them by their values
    private String name;
    private int value;
    public Coin(String n, int v){
        name = n;
        value = v;
    }

    public int getValue(){
        return this.value;
    }

    public String getName(){
        return this.name;

    }

    //Selection Sort Strikes Again
    //
    public Coin[] sort(Coin[] a){
        Coin helper;
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                if(a[j].getValue()<= a[i].getValue()){
                    helper = a[i];
                    a[i] = a[j];
                    a[j] = helper;
                }
            }
        }

        return a;

    }
}
