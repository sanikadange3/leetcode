public class lengthoflastwordinstring {

    public static void main(String[] args) {

        String s = "  hello world  ";

        s=s.trim();

        String[] words = s.split("\\s+");

        int count= words[words.length-1].length();   
    
        System.out.println(count);
    }
}