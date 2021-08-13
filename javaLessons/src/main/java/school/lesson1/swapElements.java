package school.lesson1;

import java.util.Arrays;
import java.util.List;

public class swapElements {

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        String[] arr = {"Java", "python", "js", "Go"};


        System.out.println( Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
    }
}
