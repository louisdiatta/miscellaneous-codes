public class Palindrome {
    public static boolean isPalindrome(String c) {
        int n = c.length();
        c = c.toLowerCase();
        
        for( int i = 0; i < n/2; i++ )
          if (c.charAt(i) != c.charAt(n-i-1)) return false;
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
