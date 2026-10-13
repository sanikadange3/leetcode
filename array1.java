import java.util.Scanner;


public class array1
 {
    public static void main(String[] args)
 {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int [] a = new int[n] ;

    for(int i=0;i<n;i++)
    {
        System.out.print("\nEnter array elements: "+i+"=");
        a[i]=sc.nextInt();
    }
    //PRINT ARRAY ELEMENTS
    System.out.println("array elements are: ");
    for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+" ");
    }       
   
}
}
