package Stack.Problems;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Mandar";
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder =new StringBuilder();
 
        for( char ch: str.toCharArray()){  //toCharArray is used to convert the string into array so that we can perform operations using indexing
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        System.out.println(stringBuilder.toString());
    }
}
