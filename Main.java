import java.util.*;
import java.util.function.*;
import java.io.*;

public class Main {
    public static void main(String[] a) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        Function<Integer, Integer> multiplyAddOne2 = (Main::multiplyAddOne);

        System.out.println(multiplyAddOne2.apply(n));

    }

    public static int multiplyAddOne(int x) {

        return x * x + 1;
    }
}
