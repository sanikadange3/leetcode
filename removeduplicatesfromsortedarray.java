public class removeduplicatesfromsortedarray 
{
    public static void main(String[] args) 
    {
        int[] nums = {1, 1, 2, 3, 4, 4, 5};

        int i = 1;

        for (int j = 1; j < nums.length; j++) 
        {
            if (nums[j] != nums[j - 1]) 
            {
                nums[i] = nums[j];
                i++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int k = 0; k < i; k++) 
        {
            System.out.print(nums[k] + " ");
        }
    }
}