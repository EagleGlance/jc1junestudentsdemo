package com.noirix.streamapi;

@FunctionalInterface
public interface StringProcessable<F, S, T> {

    T calculateAndGet(F a, S b);
}
