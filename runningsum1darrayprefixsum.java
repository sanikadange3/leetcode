public class runningsum1darrayprefixsum {
    
    public static void main(String[] args) {
        
         int a[] ={10,20,30,40};
       

         for(int i=1;i<a.length;i++)
         {
            a[i]+=a[i-1];
         }
        
        for(int i=0;i<a.length;i++)
         {
           System.out.println(a[i]);
         }
    }
}
