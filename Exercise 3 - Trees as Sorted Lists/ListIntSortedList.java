public class ListIntSortedList implements IntSortedList {
	
	private int value;
	private ListIntSortedList next;
	
	public ListIntSortedList(int i) {
		this.value = i;
		this.next = null;
	}
	
	public void add(int i) {
		ListIntSortedList newValue = new ListIntSortedList(i);
		if(this.next == null) {
			if(i >= this.value) {
				this.next = newValue;
			}
		} else {
			if(i <= this.next.value) {
				newValue.next = this.next;
				this.next = newValue; 
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
	
	public String toString() {
		String output = this.value + ", ";
		if(this.next != null) {
			output = output + this.next.toString();
		}
		return output;
	}
}