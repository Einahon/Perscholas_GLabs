package javaStringMethods;

public class StringTrim {
    String s1="  hello ";
    public void trim() {
        System.out.println("Trim function: ");
        System.out.println(s1 + "how are you");        // without trim()
        System.out.println(s1.trim() + " how are you"); // with trim()
    }
}
