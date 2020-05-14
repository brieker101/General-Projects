/**
 * This class is my implementation of the Set class. 
 * It uses its own iterator to find, add, and remove single elements or entire collections.
 * @author Brian Hauck
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

	public class BHSet<E> {
	//Sets up the required global variables
	private int size;
	Map<E, E> index;
	
	/**
	 * initializes Map index and int size;
	 * @param map
	 */
	public BHSet(Map<E, E> map) {
		index = map;
		size = map.size();
	}
	
	/**
	 * Add a specified object
	 * @param obj
	 * @return true if add works
	 */
	public boolean add(E obj) {
		if(contains(obj)) {return false;}
		index.put(obj, obj);
		size++;
		return true;
	}
	/**
	 * add all specified objects from the collection coll
	 * Doesn't add them if they already exist
	 * @param coll
	 * @return true if size changed
	 */
	public boolean addAll(Collection<E> coll) {
		int tempSize = size;
		Iterator itr = coll.iterator();
		for(int i = 0;i<coll.size();i++) {
			E temp = (E)itr.next();
			if(contains(temp)) {}
			else{index.put(temp, temp);size++;}
			}
		if(tempSize!=size) {return true;}
		return false;
		}
	
	/**
	 * Checks that the index contains a specific object
	 * @param obj
	 * @return true if the object is found
	 */
	public boolean contains(Object obj) {
		Iterator itr = iterator();
		for(int i = 0;i<size;i++) {
			if(itr.next()==obj) {return true;}
		}
		return false;
	}
	
	/**
	 * Checks that all of the objects found in coll are also found in index
	 * @param coll
	 * @return true if all of coll is found in index
	 */
	public boolean containsAll(Collection<E> coll) {
		int teller = 0;
		Iterator itr = coll.iterator();
		for(int i = 0;i<coll.size();i++) {
			if(index.containsKey(itr.next())) {teller++;};
		}
		if(teller==coll.size()) {return true;}
		return false;
	}
	
	/**
	 * Checks for empty index
	 * @return true if size is equal to zero
	 */
	public boolean isEmpty() {if(size==0) {return true;}return false;}
	
	/**
	 * Uses built in iterator to return an iterator on index
	 * @return Iterator
	 */
	public Iterator iterator() {return  index.entrySet().iterator();}
	
	/**
	 * removes a specified object if it is found within index
	 * @param obj
	 * @return true if the size changes
	 */
	public boolean remove(Object obj) {
		if(!index.containsKey(obj)) {return false;}
		for(int i = 0;i<index.size();i++) {
			if(index.containsKey(obj)) {index.remove(obj);size--;}
		}
		return true;
	}
	
	/**
	 * removes all objects of coll that are found in index
	 * @param coll
	 * @return true if size has changed
	 */
	public boolean removeAll(Collection<E> coll) {
		int tempSize = size;
		Iterator itr = coll.iterator();
		for(int i = 0;i<coll.size();i++) {
			E temp = (E)itr.next();
			if(index.containsKey(temp)) {index.remove(temp);size--;}
		}
		if(tempSize!=size) {return true;}
		return false;
	}
	
	/**
	 * removes all objects of index that are not found within coll
	 * @param coll
	 * @return true if size has changed
	 */
	public boolean retainAll(Collection<E> coll) {
		Iterator itr1 = iterator();
		Iterator itr2 = coll.iterator();
		int tempSize = size;
		for(int i = 0;i<size;i++) {
				E temp = (E)itr1.next();
			for(int j = 0;j<coll.size();j++) {
				if(!temp.equals(itr2.next())){itr1.remove();}
			}
		}
		if(tempSize!=size) {return true;}
		return false;
	}
	
	/**
	 * size of index
	 * @return size
	 */
	public int size() { return size;}

}
