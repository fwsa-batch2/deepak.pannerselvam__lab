import java. util.Scanner;

import javax.lang.model.util.ElementScanner6;


public class relational2 {


    public static void main(String[] args) {
        /*
        int n;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();


        if(n%2==0)
        {
            System.out.println(" It is a Even number ");
        }
        else{
            System.out.println(" It is a Odd number");
        }

        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age= sc.nextInt();

        if(age>=14 &&  age<=55)
        {
        System.out.println("you are young");

        }
        else{
            System.out.println("you are not young");
        }*/

        int m1, m2,m3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of a subject: ");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        float avg= (float)(m1 + m2+ m3)/3;

        if(avg >= 70)
        {
            System.out.println("Grade A");
        }
        else if(avg >=60 && avg<70)
        {
             System.out.println("Grade B");
        }
        else if(avg >= 50 && avg < 60)
        {
            System.out.println("Grade C");
        }
        else if(avg >=40 &&  avg <50)
        {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade E");
        }



    }




    
}
