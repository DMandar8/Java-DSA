
// OUTPUT
// -----------------------------------------------
// Fibonacci Series:
// 0 1 1 2 3 5 8 
// -----------------------------------------------
// Check Prime Number
// 23 is a Prime Number.
// -----------------------------------------------
// Prime Numbers from 1 to 50
// 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 
// -----------------------------------------------
// Factorial of 5 using iterative approach
// 120
// Factorial of 5 using recursion
// 120
// -----------------------------------------------
// Check Palindrome Number
// 141 is a Palindrome Number.
// -----------------------------------------------
// 1567 has 4 digits
// -----------------------------------------------
// 153 is a Armstrong number
// -----------------------------------------------
// Reverse of 12345 is
// 54321
// -----------------------------------------------
// Digit Addition of 12345 is 15
// -----------------------------------------------
public class Main {
    public static void main(String[] args) {
        ClassicProblems obj = new ClassicProblems();
        System.out.println("-----------------------------------------------");

        System.out.println("Fibonacci Series:");
        obj.fibonacci(7);

        System.out.println();
        System.out.println("-----------------------------------------------");

        int n = 23;
        System.out.println("Check Prime Number");
        if(obj.isPrime(n)){
            System.out.println(n+" is a Prime Number.");
        }else{
            System.out.println(n+" is not a Prime Number.");
        }

        System.out.println("-----------------------------------------------");

        System.err.println("Prime Numbers from 1 to 50");
        obj.primeInRange(1, 50);

        System.out.println();
        System.out.println("-----------------------------------------------");


        System.out.println("Factorial of 5 using iterative approach");
        System.out.println(obj.factorial(5));
        System.out.println("Factorial of 5 using recursion");
        System.out.print(obj.recursiveFactorial(5));


        System.out.println();
        System.out.println("-----------------------------------------------");


        int p = 141;
        System.out.println("Check Palindrome Number");
        if(obj.isPalindrome(p)){
            System.out.println(p + " is a Palindrome Number.");
        }else{
            System.out.println(p + " is not a Palindrome Number.");
        }

        System.out.println("-----------------------------------------------");


        int count = obj.countDigits(1567);
        System.out.println("1567 has " + count + " digits");
        System.out.println("-----------------------------------------------");

        obj.armstrong(153);
        System.out.println("-----------------------------------------------");

        System.out.println("Reverse of 12345 is");
        System.out.println(obj.reverseNum(12345));

        System.out.println("-----------------------------------------------");

        System.out.println("Digit Addition of 12345 is " + obj.sumOfDigits(12345));
        System.out.println("-----------------------------------------------");


    }
}
