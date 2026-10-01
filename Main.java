import java.util.*;
import java.util.function.*;
import java.io.*;

public class Main {
    public static void main(String[] a) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        Function<Integer, Integer> multiplyAddOne = x -> x * x + 1;

        System.out.println(multiplyAddOne.apply(n));

    }
}
