package com.ten_experts.array;

/**
 * interface implementation
 */
public class SimpleSummater implements IArraySummater {

    /**
     *
     * @param arr input array
     * @return return
     */
    public int sum(final int[] arr) {

        int arraySum = 0;
        for (int anArr : arr) {
            arraySum += anArr;
        }
        return arraySum;
    }
}
