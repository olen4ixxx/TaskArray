package io.olen4ixxx.taskarray.service.implsort;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.service.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuickArraySortService implements ArraySortService {
    static Logger logger = LogManager.getLogger();

    public CustomArray resultArray(CustomArray customArray) {
        int[] array = customArray.getArray();
        int leftMarker = 0;
        int rightMarker = array.length - 1;
        int pivot = array[(leftMarker + rightMarker) / 2];
        do {
            // Moving left marker from left to right while element less than pivot
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }
            // Moving right marker while element bigger than pivot
            while (array[rightMarker] > pivot) {
                rightMarker--;
            }
            // Checking if we need to swap marked elements
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < array.length - 1) {
            resultArray(customArray);
        }
        if (0 < rightMarker) {
            resultArray(customArray);
        }
        return customArray;
    }
}
