import java.util.Scanner;

public class CountHighBitsUptoN 
{

    public static void giveCount(int n){
        int start=n;
        int result=0;
        String res="";
        while(n>0){
            int rem=n%2;
            if(rem==1){
                result++;
            }
            n=n/2;
            res=rem+res;
        }
        System.out.println("Binary equivalent of "+ start + " is " +res);
        System.out.println("Total 1s are: " + result);
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=0;
        String res="";
        int[] arr=new int[5];
        System.out.println("Enter a decimal number array...");

        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<5;i++){
            giveCount(arr[i]);
        }

    }
}
