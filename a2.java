import java.util.*;

public class a2 {

    public static void main(String[] args)
     {
     fact(); 
     fibbo();  
     prime();
     gcd1();
     infin();
     odd();
     count();
     pow();
     }

    static void fact() 
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= num; i++) 
        {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }

    static void fibbo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n =sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) 
            {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            }
    }

    static void prime()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num2 =sc.nextInt();

        if(num2 <= 1)
        {
          System.out.println("not prime number");
        }
        else
        {
           
            for(int i=2;i <= num2/2;i++)
            {
            if(num2 % i==0)
            {
                System.out.println("not prime");
            }
            else {
              
                 System.out.print("prime number =" +num2);
            }
            }
         }
     }

     static void gcd1()
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (y != 0)
       {
            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println("GCD of " + a + " and " + b + " = " + x);
     }
     static void infin()
     {
         do
         {
            System.out.println("infinite loop");
         } while(true);
     }
    static void pow()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter power (n): ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) 
        {
            result = result * x;
        }

        System.out.println(x + "^" + n + " = " + result);
    }
    static void odd()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int num = sc.nextInt();
        int sum =0;
        for (int i=1;i<=num;i++)
        {
            if(num % 2!=0 )
            {
              sum = sum+i;
            }
        }
        System.out.println("sum of numbers ="+sum);
    }
    static void count()
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter number of elements");
         int n = sc.nextInt();
        int[] arr = new int[n];   
        for(int i=0;i < 10;i++)
        { 
            System.out.println("enter elemnets "+i+" =");
            arr[i]= sc.nextInt();
        }
         int zo=0;
         int pos=0;
        int neg=0;
        for(int i=0;i < 10;i++)
        {
            if(arr[i]==0)
            {
                zo++;
            }
            else if (arr[i]<0)
            {
               neg++; 
            }
            else if(arr[i]>0)
            {
                pos++;
            }
        }
          System.out.println("count of zero ="+zo+"\n count of positive ="+pos+"\n count of negitive ="+neg);
    }
}