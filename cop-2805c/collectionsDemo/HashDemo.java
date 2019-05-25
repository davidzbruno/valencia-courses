import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashDemo{

    public static void main(String[] args) {
        // HashSet<String> set = new HashSet<String>();
        TreeSet<String> set = new TreeSet<String>(); // Data is stil unordered but it is alphabeically sorted

        // Here data is nott added as in indecing approach.
        // We gott hashCodes for elements which are being added

        set.add("John");
        set.add("Jennie");
        set.add("Jim");
        set.add("John");
        set.add("Joe");

        // 1. Data is Unqiue, no redunancy
        // 2. Data is unordered in outputt due to hashing
        System.out.println("set is:"+set);

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

        set.remove("Jim");
        System.out.println("Set after removing Jim is: "+set);
        if(set.contains("John")){
            System.out.println("John is in the set");
        }

        System.out.println("set size is "+set.size());


    }
}