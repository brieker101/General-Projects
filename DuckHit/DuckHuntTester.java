public class DuckHuntTester
{
    public static void main(String[] args){

        DuckHunt duckTest = new DuckHunt();
        String[] test1 = {"1", "2", "3", "X", "Q", "Z", "-3"};
        int result1 = duckTest.score(test1);
        String output1 =  result1 == 3? "Yay!": "Expected: " + " 3 " + "Recieved: " + result1;
        System.out.println(output1);

        String[] test2 = {"1", "-2", "X", "Q"};
        int result2 = duckTest.score(test2);
        String output2 =  result2 == -1? "Yay!": "Expected: " + " -1 " + "Recieved: " + result2;
        System.out.println(output2);

        String[] test3 = {"Z", "Q", "X", "4", "3"};
        int result3 = duckTest.score(test3);
        String output3 =  result3 == 7? "Yay!": "Expected: " + " 7 " + "Recieved: " + result3;
        System.out.println(output3);

        String[] test4 = {"5", "6", "X", "X", "Q", "Q", "Z", "X", "Q"};
        int result4 = duckTest.score(test4);
        String output4 =  result4 == 22? "Yay!": "Expected: " + " 23 " + "Recieved: " + result4;        
        System.out.println(output4);

        String[] test5 = {"X"};
        int result5 = duckTest.score(test5);
        String output5 =  result5 == 0? "Yay!": "Expected: " + " 0 " + "Recieved: " + result5;
        System.out.println(output5);
        System.out.println("Brian Hauck 3/22/2017");
    }
}
