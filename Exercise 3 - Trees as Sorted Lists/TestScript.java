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
			System.out.println("Tree already contains this number.");
		} else {
			System.out.println("Tree does not contain this number.");
		}
		String s = tree.toString();
		System.out.println(s);
		
		ListIntSortedList list = new ListIntSortedList(10);
		list.add(5);
		list.add(20);
		list.add(1);
		list.add(20);
		list.add(11);
		list.add(15);
		list.add(7);
		list.add(5);
		list.add(35);
		list.add(2);
		list.add(20);
		
			
		if(list.contains(5)) {
			System.out.println("List already contains this number.");
		} else {
			System.out.println("List does not contain this number.");
		}
		s = list.toString();
		System.out.println(s);
	}
}