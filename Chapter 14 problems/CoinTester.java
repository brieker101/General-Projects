public class CoinTester
{
   public static void main(String[] args){
    Penny p1 = new Penny();
    Nickel n1 = new Nickel();
    Dime d1 = new Dime();
    Coin c1 = new Coin("Default", 0);
    
    Coin[] a = new Coin[]{n1,d1,p1};
    for(int i = 0;i<a.length;i++){
            System.out.println(a[i].getName() + " " + a[i].getValue());
        }
    c1.sort(a);
    for(int i = 0;i<a.length;i++){
            System.out.println(a[i].getName() + " " + a[i].getValue());
        }
    
    }
}
