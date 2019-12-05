package pkg1;

class List{
	Node first;
	Node last;
	
	public List() {
		first = null;
		last = null;
	}
//	public void insertFirst(String name, double gdpPerCapita) {
//		Node newLink = new Node(name,gdpPerCapita);
//		if(isEmpty()) {
//			last = newLink;
//			newLink.nextNode = first;
//			first = newLink;
//		}
//	}
	public void insertLast(String name, double gdpPerCapita){
		Node newLink = new Node(name, gdpPerCapita);
		if(isEmpty()) {
			first = newLink;
			last = newLink;
		}
		else {
			last.nextNode = newLink;
			last = newLink;
			newLink.nextNode = null;
		}
			
	}
//	public Node delete(String name) {
//	 	Node current = first;
//		while(name.compareTo(current.countryName())!=0) {
//			if(current.nextNode == null)
//				return null;
//			else
//				current = current.nextNode;
//		}
//		if(current.nextNode.nextNode == null) 
//		{
//			current.nextNode = null;
//			current = last;
//		}
//		else 
//		{
//			current.nextNode = current.nextNode.nextNode;
//		}
//		return current.nextNode.nextNode;
//	}
	public void displayList() {
//		System.out.print("this is the Link list");
		Node current = first;
		while(current != null) {
			current.printNode();
			current = current.nextNode;
		}
		System.out.println("");
	}
	public boolean isEmpty() { //checks if it is empty
		return first==null;
	}
	public boolean isFull() { //checks if it is full
		return false;
	}
//	 public Node delete(String name) {
//		Node result = find(name);
//		if(result == null) {
//			return null;
//		}
//			if(result == first) {
//				first = first.nextNode;
//			}
//			else if(result == last) {
//				Node temp = first;
//				Node next = temp.nextNode;
//				while(next != last) {
//				temp = temp.nextNode;
//				next = next.nextNode;
//				}
//				last = temp;
//				}	
//			else
//			result = result.nextNode;
//			return result;
//	 }
	public Node delete(String name) {
		Node current = first;
		Node temp = first;
		while(name.compareTo(current.countryName())!=0) {
			if(current.nextNode == null) 
				return null;
			else {
					temp = current;
					current = current.nextNode;
				}
			if(current == first) {
				first = first.nextNode;
			}
			else if(current == last) {
				last = temp;
			}
			else
					temp.nextNode = current.nextNode;

			}
			return current;
		}
	 public Node find(String name) {
		 	int counter = 1;	
		 	Node current = first;
			while(name.compareTo(current.countryName())!=0) {
				counter++;
				if(current.nextNode == null)
					return null;
				else
					current = current.nextNode;
			}
			System.out.println("Nodes visited:  " + counter);
			System.out.println("gdpPerCapitia:  " + current.gdpPerCapita());
			return current;
	 }
	 
}


