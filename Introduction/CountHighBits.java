import java.util.Scanner;

class CountHighBits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=0;
        String res="";
        
        System.out.println("Enter a decimal number...");
        int n=sc.nextInt();

        while(n>0){
            int rem=n%2;
            if(rem==1){
                result++;
            }
            n=n/2;
            res=rem+res;
        }
        System.out.println("Binary equivalent is: " + res);
        System.out.println("Total 1s are: " + result);

      
     
    }
}