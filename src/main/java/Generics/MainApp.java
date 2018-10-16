package Generics;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

     public static void main(String arg[]){
         List<String> mylist = new ArrayList();
         mylist.add("abc");
         String myText=mylist.get(0);
         System.out.println("MyTest   >>"+myText);

         Container<Integer, String> container = new Container<Integer, String>(12,"TestString");
         int item1 = container.getItem1();
         String item2 = container.getItem2();
     }
}
