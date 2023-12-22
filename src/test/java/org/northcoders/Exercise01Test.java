package org.northcoders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {

    @Test
    public void checkHello() {
        Exercise01 ex01 = new Exercise01();
        assertEquals("Hello", ex01.capitalizeWord("hello"));
        assertEquals("The quick fox", ex01.capitalizeWord("the quick fox"));
        assertEquals("Oh no, bears!!!", ex01.capitalizeWord("oh no, bears!!!"));
    }

    @Test
    public void checkHelloAlreadyUppercase() {
        Exercise01 ex001 = new Exercise01();
        assertEquals("Hello", ex001.capitalizeWord("Hello"));
    }

    @Test
    public void checkInitials() {
        Exercise01 ex001 = new Exercise01();
        assertEquals("F.B", ex001.generateInitials("Frederic", "Bonneville"));
        assertEquals("K.M", ex001.generateInitials("Karl", "Marx"));
        assertEquals("L.H", ex001.generateInitials("Lewis", "Hamilton"));
    }

    @Test
    public void joinWordsTest() {
        Exercise01 ex01 = new Exercise01();
        assertEquals("HelloWorld", ex01.joinWords("Hello", "World"));
        assertEquals("PunkRock", ex01.joinWords("Punk", "Rock"));
        assertEquals("learnjava", ex01.joinWords("learn", "java"));
    }
}
