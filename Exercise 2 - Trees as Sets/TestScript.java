public class TestScript {
	public static void main(String[] args) {
		TreeIntSet tree = new TreeIntSet(10);
		tree.add(5);
		tree.add(20);
		tree.add(1);
		tree.add(20);
		tree.add(11);
		tree.add(15);
		
		if(tree.contains(10)) {
			System.out.println("Tree already contains this number.");
		} else {
			System.out.println("Tree does not contain this number.");
		}
	}
}