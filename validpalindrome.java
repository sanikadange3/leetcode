import java.util.*;
public class validpalindrome
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();

        s=s.toLowerCase();
        String c = "";

        for (int i = 0; i < s.length(); i++)
       {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch))
            {
                c += Character.toLowerCase(ch);
            }
        }

      int  left =0;
       int right = c.length() - 1;

        while (left < right)
       {
            if (c.charAt(left) != c.charAt(right))
            {
                System.out.println("not palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println(" palindrome ");
    }
}


