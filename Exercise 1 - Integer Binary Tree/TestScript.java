public class TestScript {
	
	public static void main(String[] args) {
		System.out.print("Please insert first value: ");
		String s = System.console().readLine();
		int firstValue = Integer.parseInt(s);
		IntegerTreeNode tree = new IntegerTreeNode(firstValue);
		
		boolean finished = false;
		while(!finished) {
			
			System.out.println("Select option for menu below:");
			System.out.println("1 - Add value.");
			System.out.println("2 - Search for value.");
			System.out.println("3 - Show maximum value.");
			System.out.println("4 - Show minimum value.");
			System.out.println("5 - Convert to complete string.");
			System.out.println("6 - Convert to simple string.");
			System.out.println("7 - Depth.");
			System.out.println("Any other number - QUIT.");
			s = System.console().readLine();
			int choice = Integer.parseInt(s);
			
			switch (choice) {
				
				case 1:
					System.out.print("Please insert new value to be added: ");
					s = System.console().readLine();
					int number = Integer.parseInt(s);
					tree.add(number);
					break;
					
				case 2:
					System.out.print("Please insert value to search for: ");
					s = System.console().readLine();
					number = Integer.parseInt(s);
					if(tree.contains(number)) {
						System.out.println("This number is in the tree.");
					} else {
						System.out.println("This number is not in the tree.");
					}
					break;
				
				case 3:
					int output = tree.getMax();
					System.out.println("Maximum value: " + output);
					break;
				
				case 4:
					output = tree.getMin();
					System.out.println("Minimum value: " + output);
					break;
				
				case 5:
					String complete = tree.toString();
					System.out.println(complete);
					break;
				
				case 6:
					String simple = tree.toStringSimple();
					System.out.println(simple);
					break;
				
				case 7:
					int depth = tree.depth();
					System.out.println("Depth: " + depth);
					break;
				
				default:
					System.out.println("Exiting...");
					finished = true;
					break;
			}	
		}
	} 	
}