package javaStringMethods;

import java.util.Arrays;

public class SplitFunction {
    String vowels = "a::b::c::d:e";

    // splitting the string at "::"
    // storing the result in an array of strings
    String[] result = vowels.split("::");

    public void splitString() {
        System.out.println("Splitting string: ");

    // converting array to string and printing it
    System.out.println("result = " + Arrays.toString(result));
}

}
