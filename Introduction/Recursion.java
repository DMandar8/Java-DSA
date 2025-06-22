import java.util.Scanner;
class Recursion{

    public static void reverseNum(int num){
        if(num<=1){
            System.out.print("1");
            return;
            
        }
        System.out.print(num+" ");
        reverseNum(num-1);
    }
    public static int addNum(int num){
        
        if(num<=1){
            
            return num;
        }
        
        return num+addNum(num-1);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number..");
        int num = sc.nextInt();
        // reverseNum(num);
        System.out.println(addNum(num));


    }
 }