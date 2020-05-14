/**
 * @author Brian Hauck
 */

import java.util.NoSuchElementException;

public class BHHeap<E>{
	
	E[] heap;
	int size;
	
	@SuppressWarnings("unchecked")
	public BHHeap() {
		heap = (E[]) new Object[24];
	}
	
	@SuppressWarnings("unchecked")
	public boolean offer(E item){
		if(heap.length-size<5) {
			E[] temp = heap;
			heap = (E[]) new Object[temp.length*2];
			for(int i = 0;i<temp.length;i++) {
				heap[i] = temp[i];
			}
		}

		int swapper = size;
		E temp;
		while(((Integer) item).compareTo((Integer)heap[swapper])<1) {
			swapper = (swapper-1)/2;
		}
		temp = heap[swapper];
		heap[swapper] = item;
		heap[size] = temp;
		size++;
		return true;
	}
	
	public E remove() {
		E temp = null;
		for(int i = 0;i<heap.length;i++) {
			for(int j = 0;j<heap.length;j++) {
				if(((Integer) heap[i]).compareTo((Integer)heap[j])<1) {
					temp = heap[i];
				}
			}
		}
		for(int i = 0;i<heap.length;i++) {
			if(heap[i]==temp) {heap[i] = null;}
		}
		
		return temp;
	}
	
	public E poll() {
		E temp = null;
		if(size<1) {return temp;}
		temp = heap[0];
		for(int i = 0;i<heap.length;i++) {
			if(i==heap.length-1) {
				heap[i] = null;
			}
			else {
				heap[i] = heap[i+1];
			}
		}
		return temp;
	}
	
	public E peek() {
		if(size<1) {return null;}
		return heap[0];
	}
	
	public E element() throws NoSuchElementException{
	return heap[0];
	}

}
