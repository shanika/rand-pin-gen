package nz.co.westpac.bs.ct;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RandomPinGeneratorTest {

    @Test
    public void generatesCorrectBatchSize() {
        RandomPinGenerator generator = new RandomPinGenerator();
        int[] result = generator.getNext(1000, 1000, 9999);

        assertNotNull(result);
        assertEquals(result.length, 1000);
    }

    @Test
    public void generatesUniqueNumbers() {
        RandomPinGenerator generator = new RandomPinGenerator();
        int[] result = generator.getNext(1000, 1000, 9999);

        Set<Integer> numbers = new HashSet<>();
        for (int j : result) {
            assertFalse(numbers.contains(j), "Failed for " + j);
            numbers.add(j);
        }
    }

    @Test
    public void generatesNumbersInRange() {
        RandomPinGenerator generator = new RandomPinGenerator();
        int[] result = generator.getNext(1000, 1000, 9999);

        assertNotNull(result);
        assertEquals(result.length, 1000);

        for (int j : result) {
            assertTrue(j < 10000);
            assertTrue(j > 999);
        }
    }

}
