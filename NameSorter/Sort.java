import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
//Brian Hauck
public class Sort{
    public static void main(String[] args) throws FileNotFoundException{
        //New Boy Names File and the thing that writes to it
        File boys = new File("boyNames.txt");
        PrintWriter boyWriter = new PrintWriter(boys);
        
        //New Girl Names file and the thing that writes to it
        File girls = new File("girlNames.txt");
        PrintWriter girlWriter = new PrintWriter(girls);
        
        //Thing that reads babynames
        Scanner in = new Scanner(new File("babynames.txt")); 

        while(in.hasNext()){
            //Stores the whole line in a variable
            String temp = in.nextLine();
            System.out.println(temp);
            
            //Boy names are the second item in a line and girl names are the fifth in a line
            int bcount = 1;
            int gcount = 4;
            
            //Splits the line
            String[] line = temp.split(" ");
            
            //Points to which piece of the split up line you want
            boyWriter.write(line[bcount] + " ");
            girlWriter.write(line[gcount] + " ");
        }
        
        boyWriter.close();
        girlWriter.close();

    }
}
