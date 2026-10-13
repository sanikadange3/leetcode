import java.util.Vector;
public class vector 
{
    
    public static void main(String[] args)
     {
        Vector<String> name = new Vector<>();

        // Adding elements to the vector
        name.add("Hello");
        name.add("World");
        name.add("Java");
     
        System.out.println("Elements in the vector: " + name);

        name.remove("World");
        System.out.println("After removing 'World': " + name);

      
       // Getting the size of the vector
        int size = name.size();
        System.out.println("Size of the vector: " + size);
     }
    }
