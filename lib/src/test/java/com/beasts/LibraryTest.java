package com.beasts;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testRun() {
        
        try {
            library.run();

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    } 



}
