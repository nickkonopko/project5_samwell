    
package pkg1;

public class Hashtable
{
	private List[] hashArray;	//array of lists
	private int arraySize;
	int size = 311;

	public Hashtable(int size) {
		arraySize = size;
		hashArray = new List[arraySize];
		for(int j=0; j<arraySize; j++)
			hashArray[j] = new List();
	}
	public void displayTable() {
		for(int j=0; j<arraySize; j++) {
			System.out.print(j + ". ");
			hashArray[j].displayList(); //displayList will be created
		}
	}
	 public static double getIntval(String name) {
		 	String result = "";

	        for (int i = 0; i < name.length(); i++) {

	            char ch = name.charAt(i);

	            result = result.concat(String.valueOf((ch + 1)));
	        }
	        return Double.parseDouble(result);
 }
	public int hashFunc(double result) {	
		double hashed =  result % arraySize;
		Double d = hashed;
		return d.intValue();
	}
	public void insert(String name, double gdpPerCapitia) {
		int hashVal = hashFunc(getIntval(name));
//		 System.out.println(hashVal);
		hashArray[hashVal].insertLast(name, gdpPerCapitia);
//		 System.out.println(hashVal);
	}
	public void delete(String name) {
		int hashVal = hashFunc(getIntval(name));
		hashArray[hashVal].delete(name);
		System.out.println("This country has been deleted: " + name + "\n");
	}
	public Node find(String name) {
		int hashVal = hashFunc(getIntval(name));
		Node theLink = hashArray[hashVal].find(name);
//		System.out.println("This country has been found: " + name + "\n");
		return theLink;
	}
	public void printFreeAndCollisions() {
		int free = 0;
		int col = 0;
		for(int i = 0; i<size; i++) {
			if(hashArray[i].first == null) { 
			free++;
		}
			else if(hashArray[i].first.nextNode != null) {
					
				col++;
			}	
		}
		System.out.println("there are " + free + " spaces available and " + col +" collisions in the hashtable\n" );
	}
}