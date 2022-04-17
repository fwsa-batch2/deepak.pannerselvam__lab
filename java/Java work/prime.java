public class prime 
{
    public static void main(String[] args)
    {
        int num = 23;
        boolean isprime = true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                isprime = false;
                break;
            }
        }
        if(isprime)
        {
            System.out.println (num + "is a prime number");
        }
        else
        {
            System.out.println (num + "not a prime");
        }
    }
  }
  
  
  
  
  
  
  
  
  
  
  

  
  
  
  
  
  
  
