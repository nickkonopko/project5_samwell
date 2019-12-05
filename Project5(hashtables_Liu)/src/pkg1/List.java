package pkg1;

class List{
	Node first;
	Node last;
	
	public List() {
		first = null;
		last = null;
	}
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

	public void displayList() {
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
	public void delete(String name) 
	{
	    if(first == null) {
	    	return;
	    }
		if(name.compareTo(first.countryName())==0 && first == last) 
	    {
	        first = null;
	        last = null;
	        return;
	    }
		// if there aren't any elements.
	    if (first == null)
	    {
	        return;
	    }
	    if (name.compareTo(first.countryName()) == 0 && first == last)
	    {
	        first = null;
	        last = null;
	        return;
	    }
	    Node temp = first;
	    Node current = first.nextNode;
	    while(current != null && name.compareTo(current.countryName())!= 0) 
	    {
	        current = current.nextNode;
	    }
	    if (current == null)
	    {
	        return;
	    }
	    if (current == first)
	    {
	        first = first.nextNode;
	    }
	    else if (current == last)
	    {
	        current = null;
	        last = temp;
	        
	        // delete last node
	    }
	    else // if it's not the first or last element in the list.
	    { 
	        Node nextNode = current.nextNode;
	        temp.nextNode = nextNode;
	        current = null;
	    } 
	}
	
	 public Node find(String name) {
		 	if(first == null) {
				System.out.println("Country not found:  " + name);
		 		return null;
		 	}
		 	int counter = 1;	
		 	Node current = first;
		 	while(name.compareTo(current.countryName())!=0) {
				counter++;
				if(current.nextNode == null) {
					System.out.println("Country not found:  " + name);
					return null;
				}
				else
					current = current.nextNode;
			}
			System.out.println("This country was found:  " + name);
		 	System.out.println("Nodes visited:  " + counter);
			System.out.println("gdpPerCapitia:  " + current.gdpPerCapita());
			return current;
	 }
	 
}
