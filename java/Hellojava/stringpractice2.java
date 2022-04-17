public class stringpractice2 {
     public static void main(String[] args) {



           //String str1 = "Mr.Shahrukh Khan";
           //System.out.println(str1.indexOf("Shah"));

//String str1 ="the great wall ";
///String str2="of china";



            //System.out.println(str1.concat(str2));


            String str = "programmer@gmail.com";
            
            int i =str.indexOf("@");
            String uname = str.substring(0,i);
            String domain = str.substring(i+1, str.length());

            System.out.println("Username : "+uname);
            System.out.println("Domain  : "+domain);

            int j= domain.indexOf(".");
            String name = domain.substring(0,j);
            System.out.println(name.equals("gmail"));


            



     }




    
}
