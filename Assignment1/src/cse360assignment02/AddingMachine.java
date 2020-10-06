package cse360assignment02;


public class AddingMachine {
	private int total;
	private String history=""; //holds history of transactions
	
	public AddingMachine() {
		total=0;
		history=history+"0";// 0 is starting transaction
	}
	public int getTotal() {
		return total; //returns total
	}
	public void add(int value) {
		total = total+value; //add value to total
		history=history+" + "+value; //add to history
	}
	public void subtract(int value) {
		total=total-value; //subtracts value from total
		history=history+" - "+value; // adds subtraction to history
		
	}
	public String toString() { 
		return history; //returns the whole transaction 
		
	}
	
	public void clear() {
		total=0; //clear total
		history="0"; //clear transaction
	}
	
}
