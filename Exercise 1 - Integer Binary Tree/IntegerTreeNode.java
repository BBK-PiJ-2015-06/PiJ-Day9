public class IntegerTreeNode {
	
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int i) {
		this.value = i;
		this.left = null;
		this.right = null;
	}
	
	//Method for adding new numbers to tree.
	public void add(int newNumber) {
		if(newNumber > this.value) {
			if(right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if(left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	//Method for testing whether a number is contained within the tree.
	public boolean contains(int number) {
		if(number == this.value) {
			return true;
		} else if(number > this.value) {
			if(right == null) {
				return false;
			} else {
				return right.contains(number);
			}
		} else {
			if(left == null) {
				return false;
			} else {
				return left.contains(number);
			}
		}
	}
	
	//Method for returning maximum value stored in the tree.
	public int getMax() {
		if(right == null) {
			return this.value;
		} else {
			return right.getMax();
		}
	}
	
	//Method for returning minimum value stored in the tree.
	public int getMin() {
		if(left == null) {
			return this.value;
		} else {
			return left.getMin();
		}
	}
	
	public String toString() {
		String leftOutput = "";
		String rightOutput = "";
		if(left == null) {
			leftOutput = "L[]";
		} else {
			leftOutput = "L" + left.toString();
		}
		if(right == null) {
			rightOutput = "R[]";
		} else {
			rightOutput = "R" + right.toString();
		}
		String output = "[" + this.value + leftOutput + rightOutput + "]";
		return output;
	}
	
	public String toStringSimple() {
		String leftOutput = "";
		String rightOutput = "";
		if(left != null) {
			leftOutput = left.toStringSimple();
		}
		if(right != null) {
			rightOutput = right.toStringSimple();
		}
		String output = "[" + this.value + leftOutput + rightOutput + "]";
		return output;
	}
}