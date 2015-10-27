public class TestScript {
	
	public static void main(String[] args) {
		TreeIntSortedList tree = new TreeIntSortedList(10);
		tree.add(5);
		tree.add(20);
		tree.add(1);
		tree.add(20);
		tree.add(11);
		tree.add(15);
		tree.add(7);
		tree.add(5);
		tree.add(35);
		tree.add(2);
		tree.add(20);
		
			
		if(tree.contains(5)) {
			System.out.println("List already contains this number.");
		} else {
			System.out.println("List does not contain this number.");
		}
		String s = tree.toString();
		System.out.println(s);
	}
}