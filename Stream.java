import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = Arrays.asList("Rizki", "Akbar", "Aqila", "Azmi", "Ayu");

        // Use Java 8 Stream to process the list
        List<String> filteredNames = names.stream()               // Convert to Stream
                .filter(name -> name.startsWith("A"))             // Filter names starting with "A"
                .map(String::toUpperCase)                         // Convert to UPPERCASE
                .sorted()                                         // Sort alphabetically
                .collect(Collectors.toList());                    // Collect into a List

        // Output the result
        System.out.println("Filtered Names: " + filteredNames);
    }
}