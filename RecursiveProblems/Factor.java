public class Factor
{
    //On my honor, I did not look up the solutions online.
    private String factors = "";
    public Factor()
    {
        int sum = 0;
        for(int i = 1;i<6;i++){
            sum = sum + 6*i + 3;
        }
        System.out.println(sum);
    }

    public String findFactors(int n){
        if(n%2>=1&&n%3>=1&&n%5>=1){
            return "*" + n;
            //Bottoming out the recursion
        }   
        //Base Cases. Pretty simple.
        if(n%5==0){
            return factors + "*5" + findFactors(n/5);
        }
        else if(n%3==0){
            return factors  + "*3" + findFactors(n/3);
        }
        else if(n%2==0){ 
            return factors + "*2" + findFactors(n/2);
        }
        return factors;
    }

}
