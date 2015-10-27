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
		
	}
	

	public boolean containsVerbose(int i) {
		
	}
	

	public String toString() {
		
	}	
	
}