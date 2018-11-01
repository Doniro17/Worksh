package com.ten_experts.array;

/**
 * my own exception
 */
public class ArraySummaterException extends Exception {
    /**
     * constructor
     * @param message output string
     */
    public ArraySummaterException(final String message) {
        super(message);
    }

    /**
     * @param e ex cause
     * @param message output string
     */
    public ArraySummaterException(final String message, final Exception e) {
        super(message, e);
    }
}
