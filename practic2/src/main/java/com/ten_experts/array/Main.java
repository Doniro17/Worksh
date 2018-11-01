package com.ten_experts.array;

import java.util.Random;

/**
 * main class for build proj
 */
public final class Main {
    private Main() {

    }

    /**
     * psvm
     *
     * @param args arg
     * @throws ArraySummaterException ex
     */
    public static void main(final String[] args) throws ArraySummaterException {

        Random random = new Random();
        final int someNumber = 5;
        int maxValue = someNumber;
        SimpleSummater summater = new SimpleSummater();
        int result = summater.sum(new int[]{random.nextInt(maxValue), random.nextInt(maxValue),
                random.nextInt(maxValue), random.nextInt(maxValue)});
        System.out.println(result);
    }
}
