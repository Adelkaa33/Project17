public class Mane {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        System.out.println(palindrome.isPalindromeWord("казак")); // true
        System.out.println(palindrome.isPalindromeWord("комок")); // true
        System.out.println(palindrome.isPalindromeWord("ротор")); // true
        System.out.println(palindrome.isPalindromeWord("привет")); // false
        System.out.println(palindrome.isPalindromeWord("машина")); // false
    }
}