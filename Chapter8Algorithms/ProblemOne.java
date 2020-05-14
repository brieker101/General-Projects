
/**
 * This class takes a line from a file and places it into an ArrayList. It does this 16 times.
 * After the 16th time, it then sorts the list and parts it out to two different output files.
 * It does this until there are no lines left in the original file. It then merge sorts the two output fills back into the original one.
 * If you open any of the .txt files in the directory, the first half shows them unsorted, then sorted.
 * I did this with Strings, but you could probably do it with integers too.
 * @author Brian Hauck
 */
import java.util.*;
import java.io.*;

	@SuppressWarnings("unchecked")
	public class ProblemOne	<E> {
		
	private ArrayList<E> holder;
	
	private File output1;
	private File output2;
	private File outputF;
	private Writer writer1;
	private Writer writer2;
	private Writer writerF;
	private Scanner in;

	public ProblemOne(String inputFile) throws IOException {
		holder = new ArrayList<E>();
		in = new Scanner(new File(inputFile));
		output1 = new File("output1.txt");
		output2 = new File("output2.txt");
		outputF = new File("Entries Sorted.txt");
		writer1 = new FileWriter(output1);
		writer2 = new FileWriter(output2);
		writerF = new FileWriter(outputF);
	}
	

	public void sort() throws IOException {
		
		Scanner in1;
		Scanner in2;
		String temp1;
		String temp2;
		
		while(in.hasNextLine()) {
			for(int i = 0;i<16;i++) {
				if(!in.hasNextLine()) {i = 16;}
				else {
					holder.add((E)in.nextLine().toLowerCase());
				}
			}
			Collections.sort((List)holder);
			for(int i = 0;i<holder.size();i++) {
				if(i%2==0) {writer1.write((String)holder.get(i) + "\r\n");}
				else {writer2.write((String)holder.get(i)  + "\r\n");}
			}
			
		}
			writer1.close();
			writer2.close();
		
			in1 = new Scanner(output1);
			in2 = new Scanner(output2);
			temp1 = in1.nextLine();
			temp2 = in2.nextLine();
		
			for(int i = 0;i<holder.size();i++) {
			
					if(temp1.compareTo(temp2)>=0) {
						writerF.write(temp1 + "\r\n");
						temp1 = in1.nextLine();
					}
					else {
						writerF.write(temp2 + "\r\n");
						temp2 = in2.nextLine();
					}
				
				}	
			for(int i = 0;i<holder.size();i++) {
				writerF.write(holder.get(i) + "\r\n");
			}
		in1.close();
		in2.close();
		writerF.close();	
	}

}