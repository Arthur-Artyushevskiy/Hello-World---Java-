package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    void isAGreeting(){
        var hello = new HelloWorld();
        assertEquals("Hello World!", hello.getGreeting());
    }

}