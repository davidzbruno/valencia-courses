import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo{


    public static void main(String[] args){

        //list1 can onolu store Strirng Objects
        ArrayList<String> list1 = new ArrayList<String>(); //type specific

        //list2 can store any type of Object
        ArrayList list2 = new ArrayList(); //any type

        Student s1 = new Student();
        s1.roll = 101;
        s1.name = "Mike";

        //1. Add Data in List
        list1.add("John");      //0
        list1.add("Stacy");     //1
        list1.add("Jim");       //2
        list1.add("Jennie");    //3
        list1.add("John");      //4
        // list1.add(10); // error
        // list1.add(2.0) // error
        
        
        list2.add("John");
        list2.add(10);
        list2.add(2.2);
        list2.add('A');
        list2.add(s1);
        list2.add("Jack");

        //print reference to list -> prints elements in the list in order fo way appended to list
        System.out.println("list1 is: "+list1);
        System.out.println("list2 is: "+list2);
        

        //2.Get the element from the list
        String name = list1.get(2);
        System.out.println("Name is: "+ name);

        Object obj = list2.get(2);
        System.out.println("obj is: "+obj);

        //3. Update ELement in List
        list1.set(2,"Fionna");
        System.out.println("list1 now is: "+list1);

        //4.Remove Element from list
        list1.remove(2);
        System.out.println("list1 after remove is: "+list1);

        //list1.clear(); -> Remove All

        if(list1.contains("john")){
            System.out.println("John is in the list");
        }

        //5. Itereate in ArrayList
        System.out.println("--Iterating with For Loop---");
        for(int i =0, j = list1.size(); i < j; ++i){
            System.out.println(list1.get(i));
        }

        System.out.println("--Iterating with Enhanced For Loop---");
        for(Object o : list2){
            System.out.println(o);
        }

        System.out.println("--Iterating with Iterator---");
        Iterator<Object> itr = list2.iterator();
        // System.out.println(itr.next());
        // System.out.println(itr.next());

        while(itr.hasNext()){
            Object o = itr.next();
            System.out.println(obj);
            if(o.equals("Jack")){
                System.out.println("Removing Jack");
                itr.remove();
            }
        }
        
        System.out.println("list2 after remove is: "+list2);

    }
}