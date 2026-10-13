public class romanumerals {
    public static void main(String[] args) 
    {
        int num = 1994;
        StringBuilder sb = new StringBuilder();

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) 
        {
            while (num >= values[i]) 
            {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }

        System.out.println("Roman numeral representation: " + sb.toString());
    }
    
}
