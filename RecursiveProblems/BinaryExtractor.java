public class BinaryExtractor
{   
    public BinaryExtractor(){}
    //On my honor, I did not look up the solutions online.
    //Well I learned binary, so that's a plus. I don't know how to do this normally.
    //I only looked up how to convert from decimal to binary.
    //I did not look up the solution online 
    //  Hundreds| Tens | Ones
    //    2^2      2^1    2^0
    //  etc
    public String binaryExtractor(int n){
        String str = "";
        //Trying to find the end digits for the last few places.
        if(n==2){
                str = str + 10;
                return str;
        }
        else if(n==1){
                str = str + 1;
                return str;
        }       
        else if(n==0){
            return str;
        }
        int counter = 0;
        //Find the largest 2^x that can be taken out of n
        while(n-(2^counter)>0){
            counter++;
        }
        n = n - 2^counter;
        //???
        return str + binaryExtractor(n);
    }
}
