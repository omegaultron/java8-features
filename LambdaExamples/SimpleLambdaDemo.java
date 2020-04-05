package LambdaExamples;

// functional interface for lambda expression with no param
interface MyNumber {
    double getValue();
}

// functional interface for lambda expression with single param
interface NumericTest {
    boolean test(int n);
}

// functional interface for lambda expression with 2 param
interface NumericTest2 {
    boolean test(int n, int d);
}

/**
 * SimpleLambdaDemo
 */
public class SimpleLambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber = () -> 123.45;
        
        System.out.println("A fixed double value : "+myNumber.getValue());

        myNumber = () -> Math.random() * 100;
        System.out.println("A random double value : "+myNumber.getValue());
        System.out.println("Another random double value : "+myNumber.getValue());

        // myNumber = () -> "string"; // cause Type Mismatch Error

        NumericTest isEven;

        isEven = (n) -> n%2 == 0;   // isEven = n -> (n % 2)==0; also works


        if(isEven.test(10)) System.out.println("10 is even");
        if(!isEven.test(9)) System.out.println("9 is odd");

        NumericTest isNegative;

        isNegative = (n) -> n<0;    // isNegative = n -> n<0; also works

        if(isNegative.test(-10)) System.out.println("Number (-10) is negative");
        if(!isNegative.test(10)) System.out.println("Number (10) is positive");


        NumericTest2 isFactor;

        isFactor = (n, d) -> n%d == 0;

        // isFactor = (int n, int d) -> n%d == 0; //this works explicit type of parameters
        // isFactor = (int n, d) -> n%d == 0; //this won't works as explicit types of parameters need to specified for all params
        
        if(isFactor.test(6, 2)) System.out.println("2 is factor of 6");
        if(isFactor.test(10, 3)) System.out.println("3 is factor of 10");


    }
}