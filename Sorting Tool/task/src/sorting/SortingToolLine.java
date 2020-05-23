package sorting;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingToolLine {
    public void sort(List<String> lineList) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            final String word = scanner.nextLine();
            lineList.add(word);
        }
        int current, indexOfMax = 0, maxLength = lineList.get(0).length(),index=0;

        while (index < lineList.size()-1) {
            current = lineList.get(++index).length();
            if (current > maxLength) {
                indexOfMax = index;
                maxLength = current;
            }
        }
        String maxWord=lineList.get(indexOfMax);
        int greatest = Collections.frequency(lineList, maxWord);
        int coincidences=(100/lineList.size()*greatest);
        System.out.printf("Total lines: %d.\nThe longest line:\n%s\n(%d time(s), %d%%).",
                lineList.size(), maxWord, greatest,coincidences);
    }
}
