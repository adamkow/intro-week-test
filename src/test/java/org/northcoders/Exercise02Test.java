package org.northcoders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {

    @Test
    public void addExclamationIfStartsWithATest() {
        Exercise02 ex02 = new Exercise02();
        assertEquals("Awesome!", ex02.addExclamationIfStartsWithA("Awesome"));
        assertEquals("Amazing!", ex02.addExclamationIfStartsWithA("Amazing"));
        assertEquals("Hello", ex02.addExclamationIfStartsWithA("Hello"));
    }

    @Test
    public void getWordsBetweenParenthesesTest() {
        Exercise02 ex02 = new Exercise02();
        assertEquals("Java", ex02.returnWordsBetweenParentheses("I love learning (Java)"));
        assertEquals("Northcoders", ex02.returnWordsBetweenParentheses("I am a (Northcoders) student"));
        assertEquals("Simon", ex02.returnWordsBetweenParentheses("The best coach is (Simon), by far!"));
    }

    @Test
    void ifEndsWithExclamationReplaceWithQuestionMarkTest() {
        Exercise02 ex02 = new Exercise02();
        assertEquals("Hello?", ex02.ifEndsWithExclamationReplaceWithQuestionMark("Hello!"));
        assertEquals("NORTHCODERS", ex02.ifEndsWithExclamationReplaceWithQuestionMark("Northcoders"));
        assertEquals("String methods are awesome?", ex02.ifEndsWithExclamationReplaceWithQuestionMark("String methods are awesome!"));

    }

    @Test
    void onlySixCharactersOrMoreAllowed() {
        Exercise02 ex02 = new Exercise02();
        assertEquals("Northcoders has 6 characters or more", ex02.onlySixCharactersOrMoreAllowed("Northcoders"));
        assertEquals("Java does not have more than 6 characters", ex02.onlySixCharactersOrMoreAllowed("Java"));
        assertEquals("Banana has 6 characters or more", ex02.onlySixCharactersOrMoreAllowed("Banana"));
    }
}