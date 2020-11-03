package com.tkonieczny;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Optional<String> pop() {
       Optional <String> tmpElement = Optional.ofNullable(getStack().get(TOP));
        getStack().remove(TOP);
       if(tmpElement.isPresent()) return tmpElement;
       else
           return Optional.empty();
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
