public class TestScript {
	
	public static void main(String[] args) {
		ListIntSet list = new ListIntSet(10);
		list.add(5);
		list.add(20);
		list.add(1);
		list.add(20);
		list.add(11);
		list.add(15);
		list.add(7);
		
			
		if(list.containsVerbose(12)) {
			System.out.println("List already contains this number.");
		} else {
			System.out.println("List does not contain this number.");
		}
	}
	
}