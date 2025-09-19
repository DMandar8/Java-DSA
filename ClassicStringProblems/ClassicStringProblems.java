
import java.util.Arrays;

public class ClassicStringProblems {

    public boolean isPalindrome(String str){
        char[] arr = str.toCharArray();
        StringBuilder newstr = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            newstr.append(arr[i]);
        }

        return str.equals(newstr.toString());
    }

    public String reverseString(String str){

        char[] arr = str.toCharArray();
        StringBuilder newstr = new StringBuilder();

        for(int i=arr.length-1; i>=0; i--){
            newstr.append(arr[i]);
        }

        return newstr.toString();
    }

    public void countVowelConsonants(String str){
        char[] arr = str.toCharArray();
        int vowel = 0;
        int consonant = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
                vowel++;
            }
            else{
                consonant++;
            }
        }

        System.out.println(str + " has " + vowel + " vowels and " + consonant + " consonants");
    }


    public int countWords(String str){
        char[] arr = str.toCharArray();
        int words = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                words++;
            }
        }


        return words;
    }

    public boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        char[] arr = s1.toLowerCase().toCharArray();
        char[] arr1 = s2.toLowerCase().toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        return Arrays.equals(arr,arr1);
    }
}
