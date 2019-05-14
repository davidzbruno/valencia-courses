public class PalindromeTest {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromChecker("bob","aaa"," ", "a", "aa", "bb", "aba", "bab", "bob");
        System.out.println("All strings entered were palindromes: " + result);
    }
}
