package Generics;

import java.sql.SQLOutput;
import java.util.*;

public class MainApp {

     public static void main(String arg[]){
         List<String> mylist = new ArrayList();
         mylist.add("abc");
         String myText=mylist.get(0);
         System.out.println("MyTest   >>"+myText);

         Container<Integer, String> container = new Container<Integer, String>(12,"TestString");
         int item1 = container.getItem1();
         String item2 = container.getItem2();

         Set<String> set1 = new HashSet();
         set1.add("Test1");
         set1.add("Test2");
         set1.add("Test3");

         Set<String> set2 = new HashSet();
         set2.add("Test1");
         set2.add("Test2");
         set2.add("Testmore");

         Set<String> resultSet = union(set1, set2);
         Iterator<String> it = resultSet.iterator();
         while(it.hasNext()){
             String value= it.next();
             System.out.println("STring value : " + value);
         }

         Set<Integer> intset1 = new HashSet();
         intset1.add(1);
         intset1.add(2);
         intset1.add(3);

         Set<Integer> intset2 = new HashSet();
         intset2.add(1);
         intset2.add(1);
         intset2.add(4);

         Set<Integer> IntresultSet = union(intset1, intset2);
         for (int intvalue: IntresultSet
              ) {
             int value= intvalue;
             System.out.println(value);

         }



     }

     public static <E> Set union(Set<E> set1, Set<E> set2){
         Set<E> resultSet = new HashSet(set1);
         resultSet.addAll(set2);
         return resultSet;
     }
}
