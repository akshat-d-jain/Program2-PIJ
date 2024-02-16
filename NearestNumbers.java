public class NearestNumbers {
    public static int findNearest(double[] array) {
        double minDiff = Double.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < array.length - 1; i++) {
            double diff = Math.abs(array[i] - array[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
