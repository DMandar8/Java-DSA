
// OUTPUT
// --------------------------------------------------
// 'madam' is a Palindrome
// --------------------------------------------------
// Reverse of MANDAR is RADNAM
// --------------------------------------------------
// 'MandarDeshmukh' has 4 vowels and 12 consonants
// --------------------------------------------------
// 'I love Programming' contains 3 words.
// --------------------------------------------------


public class Main {
    public static void main(String[] args) {
        ClassicStringProblems obj = new ClassicStringProblems();


        System.out.println("--------------------------------------------------");
        if(obj.isPalindrome("madam")){
            System.out.println("'madam' is a Palindrome");
        }else{ 
            System.out.println("Not a Palindrome");
        }
        System.out.println("--------------------------------------------------");


        System.out.println("Reverse of MANDAR is " + obj.reverseString("MANDAR"));

        System.out.println("--------------------------------------------------");


        obj.countVowelConsonants("'MandarDeshmukh'");

        System.out.println("--------------------------------------------------");


        System.out.println("'I love Programming' contains " + obj.countWords("I love Programming") + " words.");

        System.out.println("--------------------------------------------------");



    }
}
