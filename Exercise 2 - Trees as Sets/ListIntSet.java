public class ListIntSet implements IntSet {
	
	private int value;
	private ListIntSet next;
	
	public ListIntSet(int i) {
		this.value = i;
		this.next = null;
	}
	
	public void add(int i) {
		if(!contains(i)) {
			
		}
	}
	

	public boolean contains(int i) {
		
	}
	

	public boolean containsVerbose(int i) {
		return true;
	}
	

	public String toString() {
		return "";
	}
	
}