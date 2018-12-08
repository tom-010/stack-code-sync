package io.deniffel.stack;

public class Stack {

    Integer element = null;

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public int getSize() {
        return element == null ? 0 : 1;
    }

    public void push(int element) {
        this.element = element;
    }
}
