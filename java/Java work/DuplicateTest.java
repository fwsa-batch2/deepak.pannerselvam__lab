public class DuplicateTest
 {
     public static void main(String args[]) 
     {
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};    
        System.out.println("Duplicate in give a number");

        for(int i=1;i<arr.length;i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j]) //duplicate 
                    System.out.println(arr[j]);
            }
        }
    }
 }
