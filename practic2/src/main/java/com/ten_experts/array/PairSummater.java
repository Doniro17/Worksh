package com.ten_experts.array;

/**
 * PairSummater
 */
public class PairSummater implements IArraySummater {
    /**
     * @param arr - array
     * @return return statement
     * @throws ArraySummaterException - own exception
     */
    public int sum(final int[] arr) throws ArraySummaterException {

        if (arr.length % 2 != 0) {
            throw new ArraySummaterException("Array length is" +
                    " not a multiple of two");
        }

        int maxSum = Integer.MIN_VALUE;
        int[] arraySum = new int[arr.length / 2];
        for (int i = 0; i < arraySum.length; i++) {
            arraySum[i] = arr[2 * i + 1] + arr[2 * i];
            if (maxSum < arraySum[i]) {
                maxSum = arraySum[i];
            }
        }
        return maxSum;
    }
}
