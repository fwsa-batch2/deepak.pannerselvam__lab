public class perfect 
{
    // 6 -> 1 +2 +3 =6
    public static void main(String[] args)
    {
        int num = 6;
        boolean b = isperfect(num);
        if(b)
        {
          System.out.println("it is perfect number");
        }
        else
        {
        System.out.println("it is a not");
        }
    }
    public static boolean isperfect(int num)
    {
        int sum = 0;
        for (int i=1;i<=num/2;i++)
        {
            if (num%i==0)
              sum += i;
        }
        if (num==sum)
           return true;
        return false;
    }
}




















