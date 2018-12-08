package io.deniffel.stack;

import org.junit.Test;

import static org.junit.Assert.*;


public class StackTest {

    @Test
    public void canCreateStack() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void pushOnStack_stackIsNotEmpty() {
        Stack stack = new Stack();
        stack.push(1);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getSize());
    }

    @Test
    public void topOfStack_latestPushedElement() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.top());
    }
}
