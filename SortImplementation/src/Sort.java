/**
 * Bubble Sort -  Loop through array:  Swap spots of elements to order them.  Repeat until list is sorted.  This is one of the very worst sorts that exist.
	Insertion Sort - Loop through and find lowest/highest element.  Put in 1st spot, move up a spot, loop to find lowest/highest, repeat.
	Selection Sort - Look at next element, loop through elements up until current position, place element in that spot.  Repeat.
	Shell Sort - Improved Selection sort.  //Comment in a paragraph about Shell Sort
 * @author Brian Hauck
 *
 */
public class Sort<E> {
	
	public Sort() {}
	
	public E[] BHBubbleSort(E[] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				if(((Integer)arr[j]).compareTo(((Integer)arr[i]))>0) {
					E temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	/**
	 * Searches for a value that is smaller/larger than the current one (arr[i])
	 * @param arr
	 * @return
	 */
	public E[] BHInsertionSort(E[] arr) {
		Integer max = 0;
		int maxIndex = 0;
		E temp;
		boolean teller = false;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				if(((int)arr[j])>max) {max = (Integer) arr[j];maxIndex = j;teller = true;}
			}
			if(teller) {
				temp = arr[i];
				arr[i] = arr[maxIndex];
				arr[maxIndex] = temp;
			}
		}
		return arr;
	}
	
	/**
	 * Slowly makes the unsorted list smaller and smaller until the whole list is sorted.
	 * @param arr
	 * @return
	 */
	public E[] BHSelectionSort(E[] arr) {
		Integer max = 0;
		int maxIndex = 0;
		E temp;
		for(int i = 0;i<arr.length;i++) {
			for(int j = i;j<arr.length;j++) {
				if(((int)arr[j])>max) {max = (Integer) arr[j];maxIndex = j;}
			}
			temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
		return arr;
	}
	/**
	 * This method goes in the reverse direction of selection sort. Instead of making the list to iterate through smaller, 
	 * this one slowly increases the size by one. It then shifts all of the elements up if it finds a value that should go between two other values.
	 * @param arr
	 * @return
	 */
	public E[] BHShellSort(E[] arr) {
		E holder;
		E temp = null;
		boolean teller = false;
		for(int i = 0;i<arr.length;i++) {
			teller = false;
			holder = arr[i];
			for(int j = 0;j<i;j++) {
				if(teller) {holder = arr[j]; arr[j] = temp; temp = holder;}
				else {
				if((Integer)holder>(Integer)arr[j+1]&&(Integer)holder<(Integer)arr[j]&&!teller) {temp = arr[j+1];arr[j+1] = holder;teller = true;}
				}
			}
		}
		return arr;
	}
	
	/**
	 * Builds a string sorted highest to lowest
	 * @param arr
	 * @return
	 */
	public String printArray(E[] arr) {
		String builder = "";
		for(int i = arr.length-1;i>=0;i--) {
			builder += arr[i] + "\n";
		}
		return builder;
	}
	
}
