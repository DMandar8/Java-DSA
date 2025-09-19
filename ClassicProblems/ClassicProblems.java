

public class ClassicProblems {
    
    //fibonacci Series

    public void fibonacci(int n){
        int a = 0; 
        int b = 1;

        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){

            if(n%i==0){
                return false;
            }

        }
        return true;
    }


    public void primeInRange(int start, int end){
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }


    public int factorial(int n){

        if(n==1){
            return 1;
        }else if(n==0 || n<0){
            return -1;
        }

        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }

        return fact;
    }

    public int recursiveFactorial(int n){
        if(n == 0){
            return 1;
        }
        int result = recursiveFactorial(n-1) * n;

        return result;
    }


    public boolean isPalindrome(int n){

        int original = n;
        int newRevNum = 0;

        while(n>0){
            newRevNum = n%10 + newRevNum*10;
            n /= 10; 
        }

        return original == newRevNum;
    }


    public int countDigits(int n){
        int count=0;

        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }

    public boolean armstrong(int n){
        int original = n;
        int countOfDigits = countDigits(n);
        double armAddition = 0;
        for(int i=0; i<countOfDigits; i++){
            int a = n%10;
            armAddition = armAddition + Math.pow(a, countOfDigits);
            n /= 10;
        }

        if(original==armAddition){
            System.out.println(original + " is a Armstrong number");
            return true;
        }

        System.out.println(n + " is not a Armstrong number");
        return false;
    }



    public int reverseNum(int n){
        int revNum = 0;

        while(n>0){
            int lastNum = n%10;
            revNum = revNum*10 + lastNum;
            n /= 10;
        }

        return revNum;
    }


    public int sumOfDigits(int n){
        int digitAddition = 0;

        while(n>0){
            int lastDigit = n%10;
            digitAddition += lastDigit;
            n/= 10; 
        }

        return digitAddition;
    }


}
