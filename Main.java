import java.io.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // br.lines() is a Stream<String> over stdin.
        // Keep the lines with at least one non-whitespace character, count
        // them, and print the count. Compare content with .isEmpty() after
        // trimming — line != "" compares references and keeps everything.
        //

        long count = br.lines()
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .count();

        System.out.println(count);
    }
}
