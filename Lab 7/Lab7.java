import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Lab7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("iris.csv"));
        String line;
        ArrayList<Double> sepalLengths = new ArrayList<>();
        ArrayList<Double> sepalWidths = new ArrayList<>();
        ArrayList<Double> petalLengths = new ArrayList<>();
        ArrayList<Double> petalWidths = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            sepalLengths.add(Double.parseDouble(values[0]));
            sepalWidths.add(Double.parseDouble(values[1]));
            petalLengths.add(Double.parseDouble(values[2]));
            petalWidths.add(Double.parseDouble(values[3]));
        }
        reader.close();

        System.out.println("Sepal Length:");
        System.out.printf("Mean: %.2f%n", mean(sepalLengths));
        System.out.printf("Median: %.2f%n", median(sepalLengths));
        System.out.printf("Mode: %.2f%n", mode(sepalLengths));
        System.out.printf("Min: %.2f%n", min(sepalLengths));
        System.out.printf("Max: %.2f%n%n", max(sepalLengths));

        System.out.println("Sepal Width:");
        System.out.printf("Mean: %.2f%n", mean(sepalWidths));
        System.out.printf("Median: %.2f%n", median(sepalWidths));
        System.out.printf("Mode: %.2f%n", mode(sepalWidths));
        System.out.printf("Min: %.2f%n", min(sepalWidths));
        System.out.printf("Max: %.2f%n%n", max(sepalWidths));

        System.out.println("Petal Length:");
        System.out.printf("Mean: %.2f%n", mean(petalLengths));
        System.out.printf("Median: %.2f%n", median(petalLengths));
        System.out.printf("Mode: %.2f%n", mode(petalLengths));
        System.out.printf("Min: %.2f%n", min(petalLengths));
        System.out.printf("Max: %.2f%n%n", max(petalLengths));

        System.out.println("Petal Width:");
        System.out.printf("Mean: %.2f%n", mean(petalWidths));
        System.out.printf("Median: %.2f%n", median(petalWidths));
        System.out.printf("Mode: %.2f%n", mode(petalWidths));
        System.out.printf("Min: %.2f%n", min(petalWidths));
        System.out.printf("Max: %.2f%n%n", max(petalWidths));
    }

    public static double mean(ArrayList<Double> nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    public static double median(ArrayList<Double> nums) {
        Collections.sort(nums);
        int middle = nums.size() / 2;
        if (nums.size() % 2 == 0) {
            return (nums.get(middle - 1) + nums.get(middle)) / 2.0;
        } else {
            return nums.get(middle);
        }
    
    }

    public static double mode(ArrayList<Double> nums) {
        HashMap<Double, Integer> counts = new HashMap<>();
        for (double num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        double mode = 0;
        int maxCount = 0;
        for (double num : counts.keySet()) {
            int count = counts.get(num);
            if (count > maxCount) {
                mode = num;
                maxCount = count;
            }
        }
        return mode;
    }

    public static double min(ArrayList<Double> nums) {
        return Collections.min(nums);
    }

    public static double max(ArrayList<Double> nums) {
        return Collections.max(nums);
    }
}