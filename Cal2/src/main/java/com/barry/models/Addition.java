package com.barry.models;

public class Addition implements Operation {
    @Override
    public long apply(long a, long b){
        return a+b;
    }

    @Override
    public boolean vaild(char operator) {
        return '+' == operator;
    }
}
