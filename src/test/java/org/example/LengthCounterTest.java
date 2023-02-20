package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class LengthCounterTest {
    LengthCounter lengthCounter;
    Map<Integer, Set<String>> testMap;

    @BeforeEach
    public void init() {
        lengthCounter = new LengthCounter();
        testMap = new HashMap<>();
    }

    @Test
    public void LengthCounter_ConstructorTest(){
        LengthCounter result = new LengthCounter();
        assertEquals(lengthCounter.getClass(), result.getClass());
    }

    @Test
    public void countWordsByLength_WithNull_ReturnEmptyMap() {
        Map<Integer, Set<String>> result = lengthCounter.countWordsByLength(null);
        assertEquals(testMap, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "      ", "\n", "\t"})
    public void countWordsByLength_WithEmptyString_ReturnEmptyMap(String emptyString) {
        Map<Integer, Set<String>> result = lengthCounter.countWordsByLength(emptyString);
        assertEquals(testMap, result);
    }

    @Test
    public void countWordsByLength_WithTwiceRepeatedString_ReturnCorrectMap() {
        testMap.put(3, Set.of("one"));
        Map<Integer, Set<String>> resultMap = lengthCounter.countWordsByLength("One One");
        assertEquals(testMap, resultMap);
    }

    @Test
    public void countWordsByLength_WithTwoStringOfSameLength_ReturnCorrectMap() {
        testMap.put(3, Set.of("one", "two"));
        testMap.put(5, Set.of("three"));
        Map<Integer, Set<String>> resultMap = lengthCounter.countWordsByLength("One two three");
        assertEquals(testMap, resultMap);
    }
    @Test
    public void countWordsByLength_WithStringAndDigitAndBackspace_ReturnCorrectMap() {
        testMap.put(3, Set.of("one", "two"));
        testMap.put(5, Set.of("three"));
        Map<Integer, Set<String>> resultMap = lengthCounter.countWordsByLength("One 12 313two34  54three");
        assertEquals(testMap, resultMap);
    }

}
