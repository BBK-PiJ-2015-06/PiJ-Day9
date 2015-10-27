public class TreeIntSet implements IntSet {
	
	private int value;
	private TreeIntSet left;
	private TreeIntSet right;
	
	public TreeIntSet(int i) {
		this.value = i;
		this.left = null;
		this.right = null;
	}
	
	public void add(int i) {
		if(!contains(i)) {
			if(i > this.value) {
				if(right == null) {
					right = new TreeIntSet(i);
				} else {
					right.add(i);
				}
			} else {
				if(left == null) {
					left = new TreeIntSet(i);
				} else {
					left.add(i);
				}
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
	
	public boolean containsVerbose(int i) {
		System.out.println(this.value);
		if(this.value == i) {
			return true;
		} else {
			if(i > this.value) {
				if(right != null) {
					return right.containsVerbose(i);
				}
			} else {
				if(left != null) {
					return left.containsVerbose(i);
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