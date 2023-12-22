package org.northcoders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {

    @Test
    public void convertToArrayOfCharsWithoutSpacesTest() {
        Exercise03 ex03 = new Exercise03();
        char[] expected = {'A', 'B', 'C'};
        assertArrayEquals(expected, ex03.convertToArrayOfCharsWithoutSpaces("A B C"));
        assertArrayEquals(expected, ex03.convertToArrayOfCharsWithoutSpaces("AB C"));
        assertArrayEquals(expected, ex03.convertToArrayOfCharsWithoutSpaces(" A   B C   "));
    }

    @Test
    public void removeLastLetterIfWordStartsWithCapitalLetter() {
        Exercise03 ex03 = new Exercise03();
        assertEquals("Amazin", ex03.removeLastLetterIfWordStartsWithCapitalLetter("Amazing"));
        assertEquals("Eg", ex03.removeLastLetterIfWordStartsWithCapitalLetter("Egg"));
        assertEquals("northcoders", ex03.removeLastLetterIfWordStartsWithCapitalLetter("northcoders"));
    }
}