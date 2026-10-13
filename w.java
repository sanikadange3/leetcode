public class w 
{          
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; //autoboxing
        System.out.println("primitive value: " + a);
        System.out.println("Integer value: " + b);

        Integer c = 20;
        int d = c; //unboxing   
        System.out.println("primitive value: " + d);
        System.out.println("Integer value: " + c);

        //using wrapper class methods
        int max = Integer.max(a, d);
        int min = Integer.min(a, d);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);    
        
        //parsing string to integer
        String str = "123";
        int num = Integer.parseInt(str);    
        System.out.println("converted value into num: " + num);
    }
}