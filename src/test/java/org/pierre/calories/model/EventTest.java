package org.pierre.calories.model;

import org.junit.Test;

public class EventTest {
    @Test
    public void testUser() {
        User user = new User("1", "pippo", "puppo");
        System.out.println(user);
    }
}
