package nz.co.westpac.bs.ct;

public class RandomPinGenerator {

    /**
     * @param batchSize
     * @param min
     * @param max
     * @return int[] random numbers
     */
    public int[] getNext(int batchSize, int min, int max) {

        int[] numbers = new int[batchSize];
        int[] isUsed = new int[max];

        int in;
        int im = 0;

        for (in = max - min; in < max && im <= batchSize; ++in) {
            int r = (int)(Math.random() * in);
            if (isUsed[r] != 0 || r < min) {
                r = in;
            }
            numbers[im++] = r;
            isUsed[r] = 1;
        }

        return numbers;
    }

}
