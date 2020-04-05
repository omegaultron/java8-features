package LambdaExamples;

interface StringReverse{
    String reverse(String string);
}

/**
 * StringReverseDemoUsingLambda
 */
public class StringReverseDemoUsingLambda {

    public static void main(String[] args) {
        StringReverse stringReverse;
        
        stringReverse = (string) -> {
            String revString = "";

            for(int i = string.length()-1; i>=0;i--){
                revString += string.charAt(i);
            }

            return revString;
        };

        System.out.println("reverse of Lambda : " + stringReverse.reverse("Lambda"));

        System.out.println("reverse of String : " + stringReverse.reverse("String"));
    }
}