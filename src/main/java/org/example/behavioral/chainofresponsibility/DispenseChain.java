package org.example.behavioral.chainofresponsibility;

public interface DispenseChain {
    void setNextLink(DispenseChain nextChain);

    void dispense(Currency currency);
}
