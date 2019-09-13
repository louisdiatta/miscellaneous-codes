public class Palindrome {
    public static boolean isPalindrome(String c) {
        
        return c.toLowerCase().equals(new StringBuilder(c.toLowerCase()).reverse().toString());
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
