package main;

import stack.*;	

public class Main {

	public static void main(String[] args) {
		// using the interface as the type
		stackabstraction<String> stack = new stackimplementation<String>();
		
		// adding transaction history to the ArrayList
		stack.push("Deposit:\tPHP 10,000.00");
		stack.push("Withdraw:\tPHP 5,000.00");
		stack.push("Withdraw:\tPHP 15,000.00");
		stack.push("Withdraw:\tPHP 500.00");
		stack.push("Deposit:\tPHP 50,000.00");
		
		// shows recorded history as a string from the ArrayList
		System.out.println("Transactions Recorded: ");
		System.out.println(stack);
		
		// shows the peak of the stack or
		System.out.println("Most Recent Transaction: ");
		System.out.print(stack.peak() + "\n");
		
		// removing the top of the stack
		System.out.println("\nUndoing the Most Recent Transaction: \n" + stack.peak());
		stack.pop();
		
		System.out.println("\nUndoing the Most Recent Transaction: \n" + stack.peak());
		stack.pop();
		
		// showing the remaining transaction after removing the two most recent transaction
		System.out.println("\nRemaining Transactions Recorded: ");
		System.out.println(stack);
		
	}

}
