package com.company;

/**
 * Created by bohaohan on 1/8/16.
 */
public class GetInput {
    static boolean hasInput = false;
    private static GetInput input = null;
    public static GetInput getInstance() {
        if (input == null) {
            input = new GetInput();
        }
        return input;
    }

    public String getInput(){
        while (hasInput){
            
        }
    }
}
