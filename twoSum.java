import java.util.*;
//import java.util.Arrays;
import java.util.HashMap;
public class twoSum
{
 public static void main(String[] args)
 {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int [] arr = new int[n] ;
    System.out.println("enter tagret element: ");
    int target = sc.nextInt();
    
   

    for(int i=0;i<n;i++)
    {
        System.out.print("\nEnter array elements: "+i+"=");
        arr[i]=sc.nextInt();
    }

    //brute force approach
    //tc=O(n^2)
    //sc=O(1)

    /*  
     for(int i=0;i<n;i++)
     {
        for(int j=i+1;j<n;j++)
     {  
        if((arr[i]+arr[j])==target)
        {
            System.out.println(arr[i] +" index = "+ i +" + " +arr[j]+"  index ="+ j +"  =  " +target);
            return;
        }
     }
    }
}
}   */
  
  //two pointer approach
  //tc=O(nlogn)
  //sc=O(1)

     Arrays.sort(arr);

    int left =0;
    int right = n-1;
    while(left<right)
    {
        int sum = arr[left] + arr [right];
        if(sum == target)
        {
            System.out.println(arr[left] +" index = "+ left +" + " +arr[right]+"  index ="+ right +"  =  " +target);
            return;
        }
        else if (sum < target)
        {
            left++;
        }
        else
        {
            right--;
        }
         
    }
}
}


        //hashmap approach
        //tc=O(n)   
        //sc=O(n)
     /*    HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int c = target-arr[i];

            if(map.containsKey(c))
            {
                System.out.println(arr[i] +" index = "+ i +"\n + \n" +c+"  index ="+ map.get(c) +" \n =\n  " +target);
                return;
            }
            else
            {
                map.put(arr[i],i);
            }
        }


     System.out.println("Element not found");
 }

}*/

/// 
/// two sum ||
/// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
///  arr = [2,7,11,15], target = 9
/// n= arr.length
/// left = 0, right = n-1
/// whlee(left<right)
/// sum = arr[left] + arr[right]
/// if(sum == target)
/// return left and right
/// else if(sum < target)
/// left++
/// else
/// right--     