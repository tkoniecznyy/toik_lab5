package com.tkonieczny;

// Stack LIFO

import java.util.List;

public interface StackOperations {
    List<String> get();
    String pop();
    void push(final String item);

}
