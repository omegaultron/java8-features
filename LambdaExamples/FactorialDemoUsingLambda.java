package LambdaExamples;

// functional interface 
interface FactorialIF {
    int fact(int n);
}

/**
 * FactorialDemoUsingLambda
 */
public class FactorialDemoUsingLambda {
    public static void main(String[] args) {
        // functional interface reference
        FactorialIF factorialIF;

        // lambda expression
        factorialIF = (n) -> {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact *i;
            }
            return fact;
        };

        System.out.println("Factorial of 5 : " + factorialIF.fact(5));
        System.out.println("Factorial of 3 : " + factorialIF.fact(3));
    }
}