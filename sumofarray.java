public class sumofarray {
    
    public static void main(String[] args) 
    {
        int[] nums = {1, 2, 3, 4, 5};
       

        for (int i=1; i < nums.length; i++) 
        {
            nums[i] += nums[i-1];
        }
               System.out.println("Sum of the array: " + nums[nums.length - 1]);
    }
}

/// maximumm achiveable number 
/// num =4
/// t=2
/// result = num+2*t formula for maximum achievable number after t operations is num + 2*t  
/// sout(result)
