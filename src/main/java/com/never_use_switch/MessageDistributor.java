package com.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public interface MessageDistributor {
    void distribute(String message);

    int myCode();
}
