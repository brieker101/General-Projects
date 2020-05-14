
public class Tester {
	public static void main(String[] args){
        MontecarloCore core = new MontecarloCore(100000000, 1);    
        System.out.println(core.estimatePi());

    }
}
