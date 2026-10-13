public class pluseone {

    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3};
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) 
        {
            if (arr[i] < 9) 
            {
                arr[i]++;
                System.out.println("Result after adding one: ");
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(arr[j] + " ");
                }
                return;
            }

            arr[i] = 0;
        }

        // If all digits were 9, we need to add a new digit at the beginning

        int[] newDigits = new int[n + 1];

        newDigits[0] = 1; 
        // The new leading digit is 1
        System.out.println("Result after adding one: ");
        for (int k = 0; k < newDigits.length; k++) 
        {
            System.out.print(newDigits[k] + " ");
        }
    }
}

