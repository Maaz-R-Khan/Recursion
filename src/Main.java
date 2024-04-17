
public class Main {
    public static void main(String[] args) {
    //   int n = 12;
    //    System.out.println("The factorial of "+n+" = " + fact(n));
        String inputString = "0001000abcdef586485975324654.6543654465465465.654zxjuf;gmlvnsru.tmg;oisauit'pmvsaiaism'gtfoisa'iretpkyi9[-w0595768681687 +ias;fmpoiujasldjfmasd;f574697612000.006800000";
        System.out.println("Number of decimal values: " + countDecimalValues(inputString));
    }


    //factorial
    public static int fact(int n) {
    System.out.println("The current n value = " + n);
        if(n == 1)
            return 1;
        else {
            return n * fact(n-1);

        }
    }

//fibonacci numbers
    public static int fib(int n) {

        if(n == 1 || n == 2 ) {
          return 1;
        }
        else {
           return  fib(n -1 ) + fib(n - 2);
         }

    }

//counts the number of zeros in a number.
    public static int numberOfZeros(int n)
    {
        int zeroCount;
        if (n==0) //base case
            zeroCount = 1;
        else if (n < 10) // and not 0
            zeroCount = 0; // 0 for no zeros
        else if (n%10 == 0)
            zeroCount = numberOfZeros(n/10) + 1;
        else // n%10 != 0
            zeroCount = numberOfZeros(n/10);
        return zeroCount;
    }



    public static int zeroCounter(String n, int index) {
        if(n.length() == index) {
            return 0;  }
        else if(n.substring(index, index + 1).equals("0")) {
            return 1 + zeroCounter(n, index + 1);
        }
        else {
           return zeroCounter(n, index + 1); }

    }


    public static int countZeros(String str){
        String currentChar = "";
        if(str.length() > 0)
            currentChar = str.substring(0,1);
        else
            return 0;
        if(str.length() == 0)
            return 0;
        else if(str.length() > 0 && currentChar.equals("0"))
            return countZeros(str.substring(1,str.length())) +1 ;
        else if(str.length() > 0 && !currentChar.equals("0"))
            return countZeros(str.substring(1,str.length())) ;
        else
            return 0;
    }


    public static int countDecimalValues(String string) {
        return decimalValueCounter(string, false);
    }

    private static int decimalValueCounter(String string, boolean passedDecimalPoint) {
        // This is the base case: If the string is empty, it returns 0
        if (string.isEmpty()) {
            return 0;
        }

        char currentCharacter = string.charAt(0);

        // If the current character is a decimal point, set passedDecimalPoint to true
        if (currentCharacter == '.') {
            passedDecimalPoint = true;
        }

        // If the current character is a digit and we have passed the decimal point, increment count
        if (Character.isDigit(currentCharacter) && passedDecimalPoint) {
            return 1 + decimalValueCounter(string.substring(1), true);
        }

        // Recursively count decimal values in the remaining substring
        return decimalValueCounter(string.substring(1), passedDecimalPoint);
    }
}










