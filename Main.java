import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type Number of Elements to Enter: ");
        int n = Integer.parseInt(br.readLine());

        // Instantiating InputHandler class
        InputHandler inputHandler = new InputHandler();

        // Calling the method from InputHandler to take input
        double[] inputArray = inputHandler.takeInput(n);

        double[] odd = new double[n];
        double[] even = new double[n];
        int index_even = 0;
        int index_odd = 0;

        System.out.println("Enter " + n + " Numbers in single line separated by space.");
        String array = br.readLine();
        String[] input = array.trim().split("\\s+");

        for (int i = 0; i < n; i++) {
            inputArray[i] = Double.parseDouble(input[i]);
            if (inputArray[i] % 2 == 0) {
                even[index_even] = inputArray[i];
                index_even++;
            } else {
                odd[index_odd] = inputArray[i];
                index_odd++;
            }
        }

        System.out.println("_______ Entered Sequence __________");
        for (int in = 0; in < n; in++) {
            System.out.println(" " + inputArray[in]);
        }

        System.out.println("_______ Even Sequence __________");
        for (int in = 0; in < index_even; in++) {
            System.out.println(" " + even[in]);
        }

        System.out.println("_______ Odd Sequence __________");
        for (int in = 0; in < index_odd; in++) {
            System.out.println(" " + odd[in]);
        }

        // Find neighboring numbers
        int nearestIndex = NearestNumbers.findNearest(inputArray);
        System.out.println("Index of the first number with smallest distance to its neighbor: " + nearestIndex);
    }
}
