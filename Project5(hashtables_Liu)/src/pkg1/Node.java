package pkg1;

public class Node
{
	String name;
	double gdpPerCapita;
	Node nextNode;
	int result;
	
	public Node(String name, double gdpPerCapita) {
		this.name = name;
		this.gdpPerCapita = gdpPerCapita;
	}
	
	public void printNode() {
		System.out.printf("	%-35s%,-20.2f\n", name, gdpPerCapita);
		
	}
	public String getname() {
		return name;
	}
	public String countryName() { //returns name as a variable
		return name;
	}
	public double gdpPerCapita() {// returns gdpPerPcapita as a variable
		return gdpPerCapita;
	}
}