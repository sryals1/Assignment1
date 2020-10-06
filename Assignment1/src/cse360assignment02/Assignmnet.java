package cse360assignment02;

public class Assignmnet {

	public static void main(String[] args) {   // main method to test Adding machine class
		AddingMachine machine = new AddingMachine(); //create machine object
		System.out.println(machine.toString()); //print default history
		machine.add(4); //add 4
		machine.subtract(3); //subtract 3
		machine.add(5);
		System.out.println(machine.toString()); //print history
		machine.add(7);
		machine.subtract(2);
		machine.subtract(6);
		System.out.println(machine.toString()); //print history
		System.out.println(machine.getTotal()); //prints total
		machine.clear();	//clears total and history
		System.out.println(machine.toString()); //prints default history
		machine.add(9);
		System.out.println(machine.toString()); //print history
		System.out.println(machine.getTotal()); //print total
		
		
		
	}

}
