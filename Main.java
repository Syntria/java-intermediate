import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++)
            words.add(br.readLine());

        // Sort words by length. Comparator.comparingInt wants a function
        // from String to int — pass it as a method reference.
        // Then print each word on its own line with forEach and another
        // method reference (note the `::`, not a `.`).
        //

        words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
        ;
    }
}
