package forLoop;

public class SummationOfNaturalNumbers {
    public void sumOfNumbers(){
    int sum = 0;
    int n = 1000;
    // for loop
    for (int i = 1; i <= n; ++i) {
        // body inside for loop
        sum += i;     // sum = sum + i
    }
        System.out.println();
    System.out.println("Sum = " + sum);
}

}
