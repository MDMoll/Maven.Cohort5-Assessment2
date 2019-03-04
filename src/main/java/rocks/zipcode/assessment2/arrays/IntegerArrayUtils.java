package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray   - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] biggerArray = Arrays.copyOf(integerArray, integerArray.length + 1);
        biggerArray[biggerArray.length - 1] = valueToBeAdded;
        return biggerArray;
    }

    /**
     * @param integerArray      - array to be manipulated
     * @param indexToInsertAt   - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        Integer[] biggerArray = Arrays.copyOf(integerArray, integerArray.length);
        biggerArray[indexToInsertAt] = valueToBeInserted;
        return biggerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        arrayHelper(integerArray);
        Integer[] changedArray = Arrays.copyOf(integerArray, integerArray.length);
        for (int i = 0; i < changedArray.length; i++) {
            if (changedArray[i] % 2 == 0) {
                changedArray[i] += 1;
            } else if (changedArray[i] % 2 != 0) {
                changedArray[i] -= 1;
            }
        }
        return changedArray;
    }

    public static List<Integer> arrayHelper(Integer[] arrayToChange) {
        List<Integer> intList = new ArrayList<>();
        for (int i : arrayToChange) {
            intList.add(i);
        }
        return intList;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {integerArray[i] += 1;}
        } return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        for (int i = 0; i < input.length; i++) {
         if (input[i] % 2 != 0) {input[i] -= 1;}
        } return input;
    }

    public static Integer[] oddsAndEvensHelper(Integer[] arr, String parity) {
        Integer[] result = new Integer[arr.length];
        if (parity.equals("odd")) {
            IntStream.range(0, arr.length).filter(i -> i % 2 != 0)
                    .forEach(i -> result[i] = arr[i] - 1);
            return result;
        } else {
            IntStream.range(0, arr.length).filter(i -> i % 2 == 0)
                    .forEach(i -> result[i] = arr[i] + 1);
            return result;
        }
    }

    public Integer[] oAndEHelper(Integer[] arr, String parity) {
        for (int i : arr) {
            if (i % 2 == 0) {
                arr[i]++;
            } else {
                arr[i]--;
            }
        }
        return arr;
    }
}