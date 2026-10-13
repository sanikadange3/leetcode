class A 
{
    void display(int num)
     {
        System.out.println("Method in class A: " + num);
    }
}

class B extends A
 {
    void display(String str) 
    
    {
        System.out.println("Method in class B: " + str);
    }
}

public class overloadingusinginheritance
 {
    
    public static void main(String[] args)
     {
        B obj = new B();

        obj.display(10); // Calls method from class A
        obj.display("Hello"); // Calls method from class B
    }
}



