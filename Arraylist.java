import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        // Convert Array to ArrayList
        Double[] array = {5.0, 7.0};
        ArrayList<Double> numbersList = new ArrayList<>(Arrays.asList(array));

        System.out.println("Elements in number list:");
        for (double num : numbersList) {
            System.out.println(" " + num);
        }

        // Convert ArrayList to Array
        Double[] newArray = numbersList.toArray(new Double[0]);
        System.out.println("Array from ArrayList:");
        for (double num : newArray) {
            System.out.println(" " + num);
        }
    }
}
