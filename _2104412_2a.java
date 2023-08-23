import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class _2104412_2a {
    public static void main(String[] args) {
        String filePath = "C:/Users/HP/Downloads/2a (3).inp";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            int[] a = new int[0]; // Initialize an empty array outside the loop
            int index = 0; // Initialize index for array insertion

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                int n = parts.length;
                // Resize the array to accommodate new elements
                a = Arrays.copyOf(a, a.length + n);
                for (int i = 0; i < n; i++) {
                    int x = Integer.parseInt(parts[i]);
                    a[index++] = x; // Insert value at current index and increment index
                }
            }
            reader.close();

            // Print the array
            System.out.println(Arrays.toString(a));

            // Calculate and print the counters
            for (int i = 0; i < a.length; i++) {
                int counter = 0;
                int y = a[i];
                while (y > 1) {
                    if (y % 2 == 0) {
                        y = y/2;
                    } else {
                        y = y+y * 2 + 1;
                    }
                    counter++;
                }
                System.out.println("Counter for " + a[i] + ": " + counter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
