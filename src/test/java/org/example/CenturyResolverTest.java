package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CenturyResolverTest {
    @ParameterizedTest
    @CsvSource(value = {
            "2000, 20",
            "2001, 21",
            "1, 1",
            "-2, -1"
    }, ignoreLeadingAndTrailingWhitespace = true)
    public void resolveCenturyTest(int year, int correctCentury) {
        CenturyResolver cr = new CenturyResolver();
        assertEquals(correctCentury, cr.ResolveCentury(year));
    }

    @Test
    public void resolveCenturyBy0Test() {
        CenturyResolver cr = new CenturyResolver();
        Throwable ex = assertThrows(IllegalArgumentException.class, () -> cr.ResolveCentury(0));
        assertEquals("there was no 0 year.", ex.getMessage());
    }
}
