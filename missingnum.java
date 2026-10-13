public class missingnum {
    
    public static void main(String[] args) 
    {
        int[] nums = {3, 0, 1};
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

       for (int i = 0; i < n; i++)
        {
            actualSum += nums[i];
        }
       

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}
