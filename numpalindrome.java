
import java.util.*;


public class numpalindrome {
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

    
            int left=0;
            int right=n-1;
                 
        
        while(left<right) 
            
        {
            if(arr[left]!=arr[right]) 
            {
              
                System.out.println("not palindrome");
                return;
            }
            left++;
            right--;       
        }
        System.out.println("palindrome");
    }
}


