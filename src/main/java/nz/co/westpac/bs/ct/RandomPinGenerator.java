package nz.co.westpac.bs.ct;

import java.util.HashSet;
import java.util.Set;

public class RandomPinGenerator {

    /**
     * Returns an array of random numbers in the given range
     *
     * @param batchSize no of pins to generate
     * @param min minimum possible value
     * @param max maximum possible value
     * @return int[] random numbers
     */
    public int[] getBatch(int batchSize, int min, int max) {

        int[] numbers = new int[batchSize];
        Set<Integer> used = new HashSet<>();

        int in;
        int im = 0;

        for (in = max - min; in < max && im <= batchSize; ++in) {
            int r = (int)(Math.random() * in);
            if (used.contains(r) || r < min) {
                r = in;
            }
            numbers[im++] = r;
            used.add(r);
        }

        return numbers;
    }

}
