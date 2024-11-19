package javaStringMethods;

public class LengthDemo {
    String str1 = "Java";
    String str2 = "";

    public void getLength() {
        System.out.println("Length demonstration:" );

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10
    }

}
