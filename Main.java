import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Main {
    public static void main(String[] a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] words = line.split(" ");

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (String word : words) {

            treeMap.put(word, treeMap.getOrDefault(word, 0) + 1);

        }

        for (Entry<String, Integer> entry : treeMap.entrySet()) {

            String str = "%s: %d".formatted(entry.getKey(), entry.getValue());

            System.out.println(str);

        }

    }
}
