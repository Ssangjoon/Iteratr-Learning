package com.iteratrlearning.chapter5;

public interface ConditionalAction {
    void perform(Facts facts);
    boolean evaluate(Facts facts);
}