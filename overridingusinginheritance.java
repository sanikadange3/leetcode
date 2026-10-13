class A 
{
    void display( int num) 
    {
        System.out.println("Method in class A"+ num);
    }
}

class B extends A 
{
    @Override
    void display(int num)
     {
        System.out.println("Method in class B"+ num);
    }
}

public class overridingusinginheritance 
{
    
    public static void main(String[] args) 
    {
        A obj = new B();
        obj.display(10); // Calls the overridden method in class B
    }
}