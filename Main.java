import java.time.*;
import java.time.temporal.ChronoUnit;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LocalDate a = LocalDate.parse(br.readLine());
        LocalDate b = LocalDate.parse(br.readLine());

        // ChronoUnit.DAYS.between(...) gives a SIGNED count of days.
        // Nothing promises which date comes first, so print the magnitude.
        //
        long count = ChronoUnit.DAYS.between(a, b);

        System.out.println(Math.abs(count));
    }
}
