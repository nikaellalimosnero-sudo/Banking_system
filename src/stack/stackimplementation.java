package stack;

import java.util.*;

public class stackimplementation<E> implements stackabstraction<E> {
	
	private List<E> data = new ArrayList<>();
	
	public void push(E x) {
		data.add(x);	 
	}
	
    // remove the last data added, LIFO
	public E pop() {
		return data.remove(data.size() - 1);
	}
		
	public E peak() {
		return data.get(data.size() - 1);
	}
		
	public boolean isEmpty() {
		return data.size() == 0;
	}
		
	//Method check size
	public int size() {
		return data.size();
	}
	
	@Override 
	public String toString() { // shows the entire stack
	    StringBuilder sb = new StringBuilder();
	    for (E item : data) {
	        sb.append(item).append("\n"); // add item 
	    }
	    return sb.toString();
	}
	
	
}

