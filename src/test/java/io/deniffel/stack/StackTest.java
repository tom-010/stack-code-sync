package io.deniffel.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class StackTest {

    @Test
    public void canCreateStack() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }
}
