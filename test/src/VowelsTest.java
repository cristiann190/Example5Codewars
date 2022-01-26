package src;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abrecadabra"));
    }

    @Test
    public void testCaseoptimized() {
        assertEquals("Nope!", 5, Vowels.getCountOptimized("abrecadabra"));
    }
}