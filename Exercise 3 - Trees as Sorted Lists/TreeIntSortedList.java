public class TreeIntSortedList implements IntSortedList {
	
	private int value;
	private TreeIntSortedList left;
	private TreeIntSortedList right;
	
	public TreeIntSortedList(int i) {
		this.value = i;
		this.left = null;
		this.right = null;
	}
	
	public void add(int i) {
		if(i > this.value) {
			if(right == null) {
				right = new TreeIntSortedList(i);
			} else {
				right.add(i);
			}
		} else {
			if(left == null) {
				left = new TreeIntSortedList(i);
			} else {
				left.add(i);
			}
		}		
	}
	
	public boolean contains(int i) {
		if(this.value == i) {
			return true;
		} else {
			if(i > this.value) {
				if(right != null) {
					return right.contains(i);
				}
			} else {
				if(left != null) {
					return left.contains(i);
				}
			}
			return false;
		} 
	}
	
	public String toString() {
		String leftOutput = "";
		String rightOutput = "";
		if(left != null) {
			leftOutput = left.toString();
		}
		if(right != null) {
			rightOutput = right.toString();
		}
		String output = leftOutput + this.value + ", " + rightOutput;
		return output;
	}
}