import java.util.*;
class primenumbers{
    public static void main(String[] args)
    {
        
        Scanner pm = new Scanner(System.in);
        int number = pm.nextInt();
        int flag=1;
        
        if (number <= 1)
            flag=0;
 
        else if (number == 2)
            flag=1;
 
        else if (number % 2 == 0)
            flag=0;
 
        for (int i = 3; i <= Math.sqrt(number); i += 2)
        {
            if (number % i == 0)
                flag=0;
            
        }
        
        if(flag==1)
            System.out.println("YES prime number");
        else
            System.out.println("NO not a prime number");
        
    }
}
