import java.util.*;

public class NestedList
{
   public static void main(String[] args)
   {
      System.out.println("my name is sachin");
       List<String> Mah = new ArrayList<String>();
       Mah.add("Pune");
       Mah.add("Mumbai");
       Mah.add("Nagpur");
       Mah.add("Jalgaon");
       Mah.add("Nashik");

     List<String> Guj = new ArrayList<>();
        Guj.add("Surat");
        Guj.add("Ahemdabad");
        Guj.add("Rajkot");
        Guj.add("Vadodara");

    List<List<String>>  State = new ArrayList<>();
      State.add(Mah);
      State.add(Guj);

        List<List<List<String>>> India = new ArrayList<>();
         India.add(State);

          System.out.println(India);

    for( List<List<String>> s1 : India)
    {
         for(List<String> s2 : s1)
          { 
               for(String s3 : s2)

                {                       
                System.out.println(s3+" ");
                }
          }
    }
 
   

  }

}
