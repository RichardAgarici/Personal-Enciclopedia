package sda.arraylist.exemple1;

import java.util.ArrayList;
import java.util.List;

public class SdaArrayList<T> extends ArrayList<T> {
    public List<T> getEveryNthElement(int startIndex, int numberOfSkippedElements) {

        List<T> collectorList = new ArrayList<>();
        if (startIndex < 0 || startIndex > size()) {
            throw new IllegalArgumentException("Invalid start index!");
        }
        if (numberOfSkippedElements < 0) {
            throw new IllegalArgumentException("Invalid number of skipped elements");
        }
        for (int i = startIndex; i < size(); i += numberOfSkippedElements + 1) {
            collectorList.add(get(i));
        }
        return collectorList;
    }
}
