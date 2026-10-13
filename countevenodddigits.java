public class countevenodddigits {
 
    public static void main(String[] args) {
        int num = 30;
        int count = 0;

        for(int i = 1; i <= num; i++)
        {
            int sum = 0;
            int temp = i;

            while(temp > 0)
            {
                sum += temp % 10;
                temp /= 10;
            }

            if(sum % 2 == 0)
            {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }

}
// count odd number between range start and end 

// int start = 5;
// int end = 15;
// int count = 0;
// for(int i = start; i <= end; i++)
// {    
//     if(i % 2 != 0)
//     {            
//         count++;
//     }
// }
// System.out.println("Count of odd numbers between " + start + " and " + end + ": " + count);  

    