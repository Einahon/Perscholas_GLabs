package javaStringMethods;

public class StringComparison {
    String s1="hello";
    String s2="hello";
    String s3="hemlo";
    String s4="flag";
    public void compareString() {
        System.out.println("\nString Comparison:");
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
    }

    public void testStringComparison1() {
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println();
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

    }

    public void testStringComparison2() {
        String s1="Perscholas";
        String s2="Perscholas";
        String s3=new String("Perscholas");
        System.out.println();
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)

    }

    public void testStringComparison3() {
        String s1="Perscholas";
        String s2="Perscholas";
        String s3="Perschola";
        String s4="PerscholasX";
        System.out.println();
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
        System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )

    }
}
