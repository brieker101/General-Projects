public class StringReverser
{
    //I DIDNT LOOK UP THE SOLUTION BUT I CHEATED MAD HARD
    //On my honor, I did not look up the solutions online.
    private int counter = 0;
  public StringReverser(){}
  //This one wasn't so bad. The one action in the middle gets a little wild.
  public String reverser(String str){
      if(counter==str.length()-1){
          //BASE CASE I CHEATED HERE
        return str;
        }
        str = str.substring(0, str.length()-counter) + str.substring(0, 1) + str.substring(str.length()-counter, str.length());
        str = str.substring(1, str.length());
        counter++;
        return reverser(str);
    }
}
