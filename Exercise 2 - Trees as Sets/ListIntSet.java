public class ListIntSet implements IntSet {
	
	private int value;
	private ListIntSet next;
	
	public ListIntSet(int i) {
		this.value = i;
		this.next = null;
	}
	
	public void add(int i) {
		if(!contains(i)) {
			if(this.next == null) {
				this.next = new ListIntSet(i);
			} else {
				this.next.add(i);
			}
		}
	}
	

	public boolean contains(int i) {
		if(this.next == null) {
			if(this.value == i) {
				return true;
			} else {
				return false;
			}
		} else {
			if(this.value == i) {
				return true;
			} else {
				return this.next.contains(i);
			}
		}
	}
	

	public boolean containsVerbose(int i) {
		return true;
	}
	

	public String toString() {
		return "";
	}
	
}