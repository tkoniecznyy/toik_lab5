package com.tkonieczny;

public class Main {

    public static void main(String[] args) {
	Stack stack = new Stack();

	stack.push("a1");
	stack.push("b2");
	stack.push("c3");
	stack.push("d4");

        System.out.println("STACK: "+stack.getStack());
        System.out.println("STACK first element: "+stack.pop()); //a1 is removed
        //one more time
		System.out.println("STACK first element: "+stack.pop()); // now b2 is on top of stack

    }
}
