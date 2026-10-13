import java.lang.Math;

public class containerofwater 
{
    public static void main(String[] args) {

        int arr[] = {1,8,6,2,5,4,8,3,7};

        int maxarea = 0;
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            int h = Math.min(arr[left], arr[right]);
            int w = right - left;
            int area = h * w;

            maxarea = Math.max(maxarea, area);

            if(arr[left] < arr[right])
                left++;
            else
                right--;
        }

        System.out.println(maxarea);
    }
}