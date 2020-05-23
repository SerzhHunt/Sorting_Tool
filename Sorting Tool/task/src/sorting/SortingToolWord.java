package sorting;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingToolWord {
    public void sort(List<String> stringList) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final String word = scanner.next();
            stringList.add(word);
        }
        int current, indexOfMax = 0, maxLength = stringList.get(0).length(),index=0;
        while (index < stringList.size()-1) {
            current = stringList.get(++index).length();
            if (current > maxLength) {
                indexOfMax = index;
                maxLength = current;
            }
        }
        String maxWord=stringList.get(indexOfMax);
        int greatest = Collections.frequency(stringList, maxWord);
        int coincidences=(100/stringList.size()*greatest);
        System.out.printf("Total words: %d.\nThe longest word: %s (%d time(s), %d%%).",
                stringList.size(), maxWord, greatest,coincidences);
    }
}
