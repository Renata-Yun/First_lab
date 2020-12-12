public class Palindrome
{
    public static void isPalindrome(String args)
    {
        String s = args;

        String rim = reverseString(s);
        if (s.equals(rim))
            System.out.println(s+" is a palindrome");
        else
            System.out.println(s+" is NOT a palindrome");
    }
    public static String reverseString(String s)
    {
        char [] sad = s.toCharArray();
        String rim = "";
        for (int i=s.length()-1; i>=0; i--)
        {
            rim += sad[i];
        }
        return rim;
    }
}
