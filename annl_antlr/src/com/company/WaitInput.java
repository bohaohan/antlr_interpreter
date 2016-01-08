package com.company;

/**
 * Created by bohaohan on 1/8/16.
 */
public class WaitInput extends Thread {
    public void run(){
        int j = 0;
        for (int i = 0; i < 10000000; i++){
            j = i;
        }
    }
}
