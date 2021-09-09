package com.barry.models;

public interface Operation {
    long apply(long a, long b);
    boolean vaild(char operator);
}
