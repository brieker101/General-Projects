/**
 * 
 * @author Brian Hauck
 *
 */
public class SortTester {

	public static void main(String[] args) {
		Integer[] test1 = new Integer[50];
		Integer[] test2 = new Integer[5000];
		Sort<Integer> core = new Sort<Integer>();
		
		for(int i = 0;i<test1.length;i++) {
			test1[i] = (int)Math.round(Math.random()*100);
		}
		for(int i = 0;i<test2.length;i++) {
			test2[i] = (int)Math.round(Math.random()*100);
		}
		
		System.out.println(core.printArray(core.BHBubbleSort(test1)));
		core.printArray(core.BHBubbleSort(test2));
		
		System.out.println(core.printArray(core.BHInsertionSort(test1)));
		core.printArray(core.BHInsertionSort(test2));
		
		System.out.println(core.printArray(core.BHSelectionSort(test1)));
		core.printArray(core.BHSelectionSort(test2));
		
		System.out.println(core.printArray(core.BHShellSort(test1)));
		core.printArray(core.BHShellSort(test2));
		
	}
}
