import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    public static void main(String[] a) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();

        String[] nums = line.split(" ");

        int sum = Arrays.stream(nums)
                .mapToInt(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sum();

        System.out.println(sum);

    }
}
