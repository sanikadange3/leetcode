public class subsequenceofstring {
    
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        if (i == s.length()) 
            {
            System.out.println("String '" + s + "' is a subsequence of '" + t + "'.");
        } else {
            System.out.println("String '" + s + "' is NOT a subsequence of '" + t + "'.");
        }
    }
}
