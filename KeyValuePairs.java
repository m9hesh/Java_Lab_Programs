//9. Write a program to accept data and display output in key, value pair
import java.util.*;

public class KeyValuePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> keyValuePairs = new HashMap<>();

        System.out.print("Enter the number of key-value pairs: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = scanner.next();
            System.out.print("Enter value: ");
            String value = scanner.next();
            keyValuePairs.put(key, value);
        }

        System.out.println("Key-Value Pairs:");
        for (Map.Entry<String, String> entry : keyValuePairs.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
