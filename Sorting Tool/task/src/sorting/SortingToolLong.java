package sorting;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingToolLong {

    public void sort(List<Long> longList) {
        Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLong()) {
                longList.add(scanner.nextLong());
            }
        long max = Collections.max(longList);
        int greatest = Collections.frequency(longList, max);
        int coincidences=(100/longList.size()*greatest);
        System.out.printf("Total numbers: %d.\nThe greatest number: %d (%d time(s)), %d%%).",
                longList.size(), max, greatest,coincidences);
    }
}