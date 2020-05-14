//Brian Hauck 4/12/2017

public class Fibonacci
{ 
    public Fibonacci(){}

    public double fibonacciR(int n){
        if(n==2){
            return 1;
        }
        if(n==1){
            return 1;
        }

        return fibonacciR(n-1) + fibonacciR(n-2);
    }

    public double fibonacciI(int n){
        double sum0 = 1;
        double sum1 = 1;
        double sum2 = 2;
        if(n==1){return 1;}
        if(n==2){return 1;}
        if(n==3){return 2;}
        if(n<1){return sum0;}

        for(int i = 0;i<(int)Math.floor(n/3);i++){
            for(int j = 0;j<3;j++){
                sum0 = sum1;
                sum1 = sum2;
                sum2 = sum1+sum0;
            }
        }
        if(n%3==0){return sum2;}
        if(n%2==0){return sum1;}
        return sum0;
    }
}
