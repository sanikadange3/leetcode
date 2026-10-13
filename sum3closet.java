
import java.util.*;
import java.util.Arrays;

public class sum3closet {
     public static void main(String[] args)
     {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n] ;
         
       
    
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter array elements: "+i+"=");
            arr[i]=sc.nextInt();
        }



        System.out.print("Enter target 55: ");
        int target = sc.nextInt();

        Arrays.sort(arr);
       int closestSum = arr[0] + arr[1] + arr[2];
        // Initialize closestSum with the sum of the first three elements        in

        for(int i=0;i<n-1;i++)
        {
           
            int left=i+1;
            int right=n-1;

            while(left<right)
            {
                int currentSum=arr[i]+arr[left]+arr[right];
                if(Math.abs(currentSum-target)< Math.abs(closestSum-target))
                    
                {
                    closestSum=currentSum;
                }
                if(currentSum < target)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
            System.out.println("Closest sum to target is: " + closestSum);
        
    
    }}
