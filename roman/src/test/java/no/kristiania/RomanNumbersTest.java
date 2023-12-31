package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {

    @Test
    void shouldTranslateOneToI() {
        assertEquals("I", RomanNumbers.toRoman(1));
    }

    @Test
    void shouldTranslateTwoToII() {
        assertEquals("II", RomanNumbers.toRoman(2));
    }

    @Test
    void shouldTranslateThreeToIII() {
        assertEquals("III", RomanNumbers.toRoman(3));
    }

    @Test
    void shouldTranslateFourToIV() { assertEquals("IV", RomanNumbers.toRoman(4)); }

    @Test
    void shouldTranslateFiveToV() { assertEquals("V", RomanNumbers.toRoman(5)); }

    @Test
    void shouldTranslateSixToVI() { assertEquals("VI", RomanNumbers.toRoman(6)); }

    @Test
    void shouldTranslateNineToIX() { assertEquals("IX", RomanNumbers.toRoman(9)); }

}
