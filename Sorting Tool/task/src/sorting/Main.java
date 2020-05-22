package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> longList = new ArrayList<>();
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            longList.add(number);
        }
        action(longList);

    }

    private static void action(List<Long> longList) {
        int greatest=0;
        Collections.sort(longList);
        Long max = longList.get(longList.size() - 1);
        for(Long l :longList){
            if(max.equals(l)){
                greatest+=1;
            }
        }
        System.out.printf("Total numbers: %d.\nThe greatest number: %d (%d time(s)).",longList.size(),max,greatest);
    }
}
