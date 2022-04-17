public class regularexpression2{
    public static void main(String[] args) {
       // String str = "a!B@c#1$2%3";

        //System.out.println(str.replaceAll("[^a-zA-Z0-9]" ,""));


        String str = "            abc                  def                ghjk                mln";



       str=str.replaceAll("\\s+", " ").trim();

      String words[] =str.split("\\s");

        System.out.println(words.length);
    }

}