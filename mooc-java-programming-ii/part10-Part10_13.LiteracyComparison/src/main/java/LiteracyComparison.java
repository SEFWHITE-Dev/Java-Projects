
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            List<String> data = Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .map(parts -> new LiteracyRecord(parts[2].trim(), parts[3].trim(), parts[4].trim(), Double.parseDouble(parts[5].trim())))
                    .sorted((a, b) -> Double.compare(a.getLiteracyRate(), b.getLiteracyRate()))
                    .map(record -> String.format("%s (%s), %s, %f", record.getCountry(), record.getYear(), record.getGender(), record.getLiteracyRate()))
                    .collect(Collectors.toList());
            
            data.forEach(System.out::println);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
