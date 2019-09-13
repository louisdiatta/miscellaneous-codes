public class Palindrome {
    public static boolean isPalindrome(String c) {
        
        int i1 = 0;
        int i2 = c.length() - 1;
        c = c.toLowerCase();
        
        while (i2 > i1) {
            if (c.charAt(i1) != c.charAt(i2)) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
