import java.util.*;
import java.io.*;

public class Main {
    static Optional<Integer> safeParse(String s) {

        try {
            return Optional.of(Integer.parseInt(s));

        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static void main(String[] a) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        // Double the parsed value with .map(...), fall back to -1 with
        // .orElse(...), and print the result.
        int number = safeParse(line).map(n -> n * 2).orElse(-1);

        System.out.println(number);

    }
}
