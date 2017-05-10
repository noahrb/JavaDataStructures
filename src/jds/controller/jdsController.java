package jds.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import jds.model.Customer;

public class jdsController {
private Queue<Customer> customerQueue;
private Stack<String> stackOfMemes;

public jdsController()
{
	customerQueue = new LinkedList<Customer>();
	stackOfMemes = new Stack<String>();
}

public void start() {
stackMethods();
queueMethods();
	
}

private void stackMethods() {
	stackOfMemes.add("longboi");
	stackOfMemes.add("datboi");
	stackOfMemes.add("lil homie");
	stackOfMemes.pop();
	stackOfMemes.peek();
	stackOfMemes.push("datboi");
}

private void queueMethods() {
	Customer jimmy = new Customer("Jimmy", 18, 6.2, true, false);
	Customer memer = new Customer("memer", 23, 5.9, true, true);
	Customer bill = new Customer("Bill", 66, 6.0, true, false);
	customerQueue.add(jimmy);
	customerQueue.add(memer);
	customerQueue.add(bill);
	
	//Jimmy gets served...
	customerQueue.remove(jimmy);
	//memer gets served...
	customerQueue.remove(memer);
}
}
