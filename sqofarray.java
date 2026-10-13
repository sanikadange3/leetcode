
import java.util.*;

public class sqofarray
{
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

    //squaring the array elements
    //tc=O(nlogn)because of sorting
    //sc=O(1)

    for(int i=0;i<n;i++)
    {
        arr[i]= arr[i] * arr[i];
    }
      Arrays.sort(arr);
    System.out.println("squared array elements are: ");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
//two pointer approach to sort squared array
//tc=O(nlogn)
    Arrays.sort(arr);
    int [] result = new int[n];
    int left =0;
    int right = n-1;
    int index = n-1;

    while(left<=right)
    {
        int leftSquare = arr[left] * arr[left];
        int rightSquare = arr[right] * arr[right];

        if(leftSquare > rightSquare)
        {
            result[index] = leftSquare;
            left++;
        }
        else
        {
            result[index] = rightSquare;
            right--;
        }
        index--;
    }

    System.out.println("squared sorted array elements are: ");
    for(int i=0;i<n;i++)
    {
        System.out.print(result[i]+" ");
    }
 }
}