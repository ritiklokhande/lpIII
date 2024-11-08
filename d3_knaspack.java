import java.util.*;

public class d3_knaspack {

    public static double getMaxValue(int W, int[] values, int[] weights, int n) {
        double[] ratio = new double[n];
        for (int i = 0; i < n; i++) {
            ratio[i] = (double) values[i] / weights[i];
        }
        
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        Arrays.sort(indices, (a, b) -> Double.compare(ratio[b], ratio[a]));
        
        double maxValue = 0;
        for (int i : indices) {
            if (weights[i] <= W) {
                maxValue += values[i];
                W -= weights[i];
            } else {
                maxValue += values[i] * ((double) W / weights[i]);
                break;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;
        int n = values.length;
        System.out.println("Maximum value in Knapsack = " + getMaxValue(W, values, weights, n));
    }
}
