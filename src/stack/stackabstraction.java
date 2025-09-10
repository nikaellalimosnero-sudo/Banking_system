package stack;

public interface stackabstraction<E> {	
	
	void push (E x);
	
	E pop ();
	
	E peak(); 
		
	boolean isEmpty();
	
	int size();

}

