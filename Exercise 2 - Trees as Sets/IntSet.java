public interface IntSet {
	
	/**
	* Adds a new int to the set.
	* If it is there already, nothing happens.
	*/
	void add(int i);
	
	/**
	* Returns true if the number is in the set, false otherwise.
	*/
	boolean contains(int i);
	
	/**
	* Returns the same values as the former method.
	* But for every element that is checked print its value on screen.
	*/
	boolean containsVerbose(int i);
	
	/**
	* Returns a string with the values of the elements in the set separated by a comma.
	*/
	String toString();
	
}