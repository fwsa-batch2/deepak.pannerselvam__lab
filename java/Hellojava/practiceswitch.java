import java.util.Scanner;
public class practiceswitch{
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Month Number");
       int month = sc.nextInt();

       switch(month)
       {
           case 1: System.out.println("Jan");
           break;
           case 2: System.out.println("Feb");
           break;
           case 3: System.out.println("Mar");
           break;
           case 4: System.out.println("Apr");
           break;
           case 5: System.out.println("May");
           break;
           case 6: System.out.println("Jun");
           break;
           case 7: System.out.println("Jul");
           break;
           default: System.out.println("Invalid month");
           
       }


    }
    


        
        
        
        
        /*int n=2;

        switch(n)
        {
             case 1:System.out.println("One");
             break;
             case 2:System.out.println("Two");
             break;
             case 3:System.out.println("Three");
             break;
             default:System.out.println("Invalid");
             
        }*/
    }
    

