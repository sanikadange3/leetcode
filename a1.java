public class a1 {
      public static void main(String[] args)
     {
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                if(i==1||j==1||i==4||j==4)
                       
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
         System.out.print("\n");
    }

           System.out.println("another pattern");
     for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
              
                System.out.print("*");
            }
        
         System.out.print("\n");
    }

    
           System.out.println("another pattern");

           for (int i=1;i<5;i++)
           {
            for(int j=i;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
           }

            System.out.println("another pattern");

           for (int i=5;i>1;i--)
           {
            for(int j=i;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n"); 
           }
           
            System.out.println("another pattern");

           for (int i=1;i<5;i++)
           {
            for(int j=1;j<5-i;j++)
             {
                  System.out.print(" ");  
             }
             for(int k=1;k<=i;k++)
             {
                System.out.print("*");
             }
             
             System.out.print("\n");
            }


             System.out.println("another pattern");

           for (int i=1;i<5;i++)
           {
            for(int j=5-i;j<4;j++)
             {
                  System.out.print(" ");  
             }
             for(int k=5-i;k>=1;k--)
             {
                System.out.print("*");
             }
             
             System.out.print("\n");
            }

            
             System.out.println("another pattern");

           for (int i=1;i<5;i++)
           {
            for(int j=5-i;j>=1;j--)
             {
                  System.out.print("*");  
             }
             for(int k=5-i;k<4;k++)
             {
                System.out.print(" ");
             }
             
             System.out.print("\n");
            }

             System.out.println("another pattern");
            for(int i=1;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
              
                System.out.print(j);
            }
        
         System.out.print("\n");
    }

     System.out.println("another pattern");
            for(int i=1;i<5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
              
                System.out.print(j);
            }
        
         System.out.print("\n");
    }
     System.out.println("another pattern");
     int a=1;
            for(int i=1;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
              
                System.out.print(a);
                a++;
            }
        
         System.out.print("\n");
    }
      System.out.println("another pattern");
            for(int i=1;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum=i+j;
                if( sum % 2 ==0)
                {              
                System.out.print("1");
                }else
                {
                    System.out.print("0");
                }
            }
         System.out.print("\n");
    }
 }
}

