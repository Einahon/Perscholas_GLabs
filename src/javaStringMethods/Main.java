package javaStringMethods;

public class Main {
    public static void main(String[] args) {

        LengthDemo ld = new LengthDemo();
        ld.getLength();

        IsEmptyExample le = new IsEmptyExample();
        le.isEmpty();

        StringTrim strTrim = new StringTrim();
        strTrim.trim();

        LowerCase_UpeperCase lcUc = new LowerCase_UpeperCase();
        lcUc.convertCases();

        Concatenation concat = new Concatenation();
        concat.concatenateStrings();

        SplitFunction splitFunction = new SplitFunction();
        splitFunction.splitString();
        
        StringComparison strComparison = new StringComparison();
        strComparison.compareString();



    }
}