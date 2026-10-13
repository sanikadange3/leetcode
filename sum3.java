
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
public class sum3 {
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
    
        //brute force approach
        //tc=O(n^2)
        //sc=O(1)//import java.util.Arrays;
            
        /* for(int i=0;i<n;i++)
         {
            for(int j=i+1;j<n;j++)
         {  
            for(int k=j+1;k<n;k++)
            {
                if((arr[i]+arr[j]+arr[k])== 0)
                {
                    System.out.println(arr[i] +" index = "+ i +" + " +arr[j]+"  index ="+ j +" + " +arr[k]+"  index ="+ k +"  =  " +" 0");
                    return;
                }
            }
         }
        }*/

         //two pointer approach
         //tc=O(n^2)
            //sc=O(1)
          /*  Arrays.sort(arr);
            for(int i=0;i<n-1;i++)
            {
                if(i>0 && arr[i]==arr[i-1])
                {
                    continue;
                }
                int left=i+1;
                int right=n-1;
                while(left<right)
                {int sum=arr[i]+arr[left]+arr[right];
                    if(sum==0)
                    {
                        System.out.println(arr[i] +" index = "+ i +" + " +arr[left]+"  index ="+ left +" + " +arr[right]+"  index ="+ right +"  =  " +" 0");

                        while(left<right && arr[left]==arr[left+1])
                        {
                            left++;

                        }
                        while(left<right && arr[right]==arr[right-1])
                        {
                            right--;
                        }

                    }else if (sum < 0)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
            }
    }*/
        //hashmap approach
        //tc=O(n^2)  
        //sc=O(n)
        
        for(int i=0;i<n-1;i++)
        {
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int c = -(arr[i]+arr[j]);
                if(set.contains(c))
                {
                    System.out.println(arr[i] +" index = "+ i +" + " +arr[j]+"  index ="+ j +" + " +c+"  index ="+ Arrays.asList(arr).indexOf( c ) +"  =  " +" 0");
                }
                else
                {
                    set.add(arr[j]);
                }
            }
        }
    
    }
}