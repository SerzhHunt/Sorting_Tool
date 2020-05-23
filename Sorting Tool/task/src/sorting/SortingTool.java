package sorting;

import java.util.ArrayList;
import java.util.List;

public class SortingTool {
    public static void main(String[] args) {
        if (args.length > 0) {
            if ("long".equals(args[1])) {
                List<Long> longList = new ArrayList<>();
                SortingToolLong sortLong = new SortingToolLong();
                sortLong.sort(longList);
            } else if ("line".equals(args[1])) {
                List<String> lineList = new ArrayList<>();
                SortingToolLine sortLine = new SortingToolLine();
                sortLine.sort(lineList);
            } else {
                List<String> stringList = new ArrayList<>();
                SortingToolWord sortWord = new SortingToolWord();
                sortWord.sort(stringList);
            }
        }
    }
}
