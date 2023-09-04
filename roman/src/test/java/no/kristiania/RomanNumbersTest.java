package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {

    @Test
    void shouldTranslateOneToI() {
        assertEquals("I", toRoman(1));
    }

    private String toRoman(int number) {
        return null;
    }
}
