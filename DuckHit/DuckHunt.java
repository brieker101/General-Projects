public class DuckHunt
{
    public DuckHunt()
    {
    }

    public int score(String[] ducksHit)
    {
        int total = 0;
        for(int i = 0; i<ducksHit.length;i++){
            if(ducksHit[i].equals("X")){
                if(i>1){
                    total = total + Integer.parseInt(ducksHit[i-1]) + Integer.parseInt(ducksHit[i-2]);
                    ducksHit[i] = Integer.toString((Integer.parseInt(ducksHit[i-1]) + Integer.parseInt(ducksHit[i-2])));
                }
                else if(i==1){
                    total = total + Integer.parseInt(ducksHit[i-1]);
                    ducksHit[i] = ducksHit[i-1];
                }
                else{
                    ducksHit[i] = "0";
                }
            }
            else if(ducksHit[i].equals("Z")){
                if(i>0){
                    total = total + 2*Integer.parseInt(ducksHit[i-1]);
                    ducksHit[i] = Integer.toString(Integer.parseInt(ducksHit[i-1]) + Integer.parseInt(ducksHit[i-1]));
                }
                else{
                    ducksHit[i] = "0";
                }
            }
            else if(ducksHit[i].equals("Q")){
                if(i>0){
                    ducksHit[i] = "0";
                    total = total - Integer.parseInt(ducksHit[i-1]);
                    ducksHit[i-1] = "0";
                }
                else{
                    ducksHit[i] = "0";
                }
            }
            else{
                total = total + Integer.parseInt(ducksHit[i]);
            }
        }
        return total;
    }
}
