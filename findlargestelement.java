
import java.util.Arrays;
 public class findlargestelement {

    
    public static void main(String[] args) 
    {

    int a[] ={10,20,30,40};
    int max =a[1];

    for(int i=0; i< a.length; i++)
    {
        if(a[i]> max)
        {
             max =a[i];
        }

    }
     System.out.println(max);
    }
}