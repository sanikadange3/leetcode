import java.util.Scanner;

public class addition {
    
 public static void main(String[] args)
 {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num 1 ");
    int n1 = sc.nextInt();
     System.out.print("Enter num 2 ");
    int n2 = sc.nextInt();
     System.out.print("Enter num 3 ");
    int n3 = sc.nextInt();
    
    if(n1>n2 && n1>n3 ){
        System.out.println("num1 is greater ="+n1);
    }
    else if(n2>n1 && n2>n3)
    {
        System.out.println("num2 is greater ="+n2);
    }
    else{
        System.out.println("num 3 is greater ="+n3);
    }

}
}
