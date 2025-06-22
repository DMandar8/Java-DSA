import java.util.Scanner;
public class XtoPower {

    public static int powerOfNum(int x, int n){
        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }
       
        return x * powerOfNum(x, n-1);
    }

    // public static int powerOfNumIterative(int x, int n){
    //     int num=1;
    //     for(int i=0; i<n;i++){
    //        num=num*x;
    //     }
    //     return num;
    // }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = sc.nextInt();
        System.out.println("Enter two numbers");
        int n = sc.nextInt();
        System.out.println(powerOfNum(x,n));


    }
    
}
