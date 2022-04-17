
import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter Two Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Option in Words ");
        String option= sc.nextLine();
        option=option.toUpperCase();

        switch(option){
           case "ADD": System.out.println("Sum is "+(a+b));
           break;
           case "SUB": System.out.println("Difference is "+(a-b));
           break;
           case "MUL": System.out.println("Product is "+(a*b));
           break;
           case "DIV": System.out.println("Ratio is "+(a/b));
           break;
           default: System.out.println( "Invalid Option");
           break;
           

        }

        
    }
    
}
