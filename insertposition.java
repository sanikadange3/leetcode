public class insertposition {

    
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 5, 6};
        int target = 4;
        int left = 0;
        int right = arr.length - 1;

     /*  while(left <= right) {
            
        if(arr[left] == target || arr[right] == target)
             {
                System.out.println("Target found at index: " + (arr[left] == target ? left : right));
                return;
             }
            if(arr[left] < target)
            {
                left++;
            }
            else
            {
                right--;
            }

        
    }
    System.out.println("Target not found. It can be inserted at index: " + left);*/

    while(left <= right) {
            
        int mid = left + (right - left) / 2;

        if(arr[mid] == target)
             {
                System.out.println("Target found at index: " + mid);
                return;
             }
            if(arr[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
                  
    } 

        System.out.println("Target not found. Insert at index: " + left);   
}
}

