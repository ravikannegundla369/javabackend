package day13;

public class sumWithThreads {
    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;

    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }

        int[] partialSums = new int[THREAD_COUNT];
        Thread[] threads = new Thread[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * (ARRAY_SIZE / THREAD_COUNT);
            int endIndex = (i + 1) * (ARRAY_SIZE / THREAD_COUNT);
            threads[i] = new Thread(new PartialSumCalculator(array, startIndex, endIndex, partialSums, i));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int sum = 0;
        for (int partialSum : partialSums) {
            sum += partialSum;
        }

        System.out.println("Sum of the array elements  : " + sum);
    }

    private static class PartialSumCalculator implements Runnable {
        private final int[] array;
        private final int startIndex;
        private final int endIndex;
        private final int[] partialSums;
        private final int threadIndex;

        public PartialSumCalculator(int[] array, int startIndex, int endIndex, int[] partialSums, int threadIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.partialSums = partialSums;
            this.threadIndex = threadIndex;
        }

        @Override
        public void run() {
            int partialSum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                partialSum += array[i];
            }
            partialSums[threadIndex] = partialSum;
        }
    }
}
