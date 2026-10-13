public class findthehighesraltitude {
    
    public static void main(String[] args) {
        
         int a[] ={-5,1,5,0,-7};
       

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
