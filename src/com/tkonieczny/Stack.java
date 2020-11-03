package com.tkonieczny;

import java.util.ArrayList;
import java.util.List;

public class Stack implements StackOperations {
    public static final int TOP = 0;
    private List<String> stack;


    public Stack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public List<String> get() {
        return getStack();
    }

    @Override
    public String pop() {
        String tmpElement = getStack().get(TOP);
        getStack().remove(TOP);
        return tmpElement;
    }

    @Override
    public void push(String item) {
    getStack().add(item);
    }

    public List<String> getStack() {
        return stack;
    }

    public void setStack(List<String> stack) {
        this.stack = stack;
    }


}
