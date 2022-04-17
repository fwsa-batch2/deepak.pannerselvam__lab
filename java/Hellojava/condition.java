import java.util.Scanner;

public class condition {
    public static void main(String[] args){


       /* Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Day number");
        int day = sc.nextInt();

        if(day==1){
            System.out.println("Mon");
        }
        else if(day==2){
            System.out.println("Tues");
        }
        else if(day==3){
            System.out.println("Wednes");
        }
        else if(day==4){
            System.out.println("Thurs");
        }
        else if(day==5){
            System.out.println("Fri");
        }
        else if(day==6){
            System.out.println("Satur");
        }
        else if(day==7){
            System.out.println("Sun");
        }
        else{
            System.out.println("Invalid Day Number");
            }*/



            Scanner sc=new Scanner(System.in);

            System.out.println("Enter a URL");
            String  url = sc.nextLine();

            String protocol= url.substring(0,url.indexOf(":"));


            if(protocol .equals("http"))
                  System.out.println("Hypertext transfer protocol");
            else if(protocol.equals("ftp"))
            System.out.println("File transfer protocol");



            String ext = url.substring(url.lastIndexOf(".")+1);

            if(ext.equals("com"))
                System.out.println("Commerical");
            else if(ext.equals("org"))
                 System.out.println("Organisation");
            else if(ext.equals("net"))
                System.out.println("Network");
        }
    }
    
    

