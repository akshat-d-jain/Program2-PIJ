import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputHandler {
    public double[] takeInput(int n) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] inputArray = new double[n];
        System.out.println("Enter " + n + " numbers separated by space:");
        String inputLine = br.readLine();
        String[] inputNumbers = inputLine.trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            inputArray[i] = Double.parseDouble(inputNumbers[i]);
        }
        return inputArray;
    }
}
