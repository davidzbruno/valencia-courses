import java.util.*;

/*
Name:   Programming Assignment
By:     David Bruno
Date:   05/19/2019
*/

class collectionsProject{

    private static void print(Collection<?> list){
        for( Object item : list ){
            System.out.println(item);
        }
    }

    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }
    public static void main(String[] args){
        /*
        - Describe auto-boxing, including why it is useful.
            Autoboxing is the automatic conversion that the Java compiler makes between the primitive types
            and their corresponding object wrapper classes. For example, converting an int to an Integer, a
            double to a Double, and so on. If the conversion goes the other way, this is called unboxing.
            Autoboxing is most useful when coding because often times we will create methods that expect an
            object as a paramter but because of the way data is passed in it is more conviently found in the
            form of a primative type. This is super useful because additional lines of code are not needed for
            compatability with the corresponding wrapper class. This is most important with the use of Generics
            and Generic-types. All generics must be reference types and inherit from the Object class, this is
            impossible with primative types. Boxing and Unboxing is thus extremely convient.
        - Auto-box an int into an Integer, and un-box an Integer to an int.
        */

        // Autoboxing
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 50; i += 2)
            li.add(Integer.valueOf(i));


        Integer i = new Integer(-8);

        // Unboxing through method invocation
        int absVal = absoluteValue(i);
        System.out.println("absolute value of " + i + " = " + absVal);

        List<Double> ld = new ArrayList<>();
        ld.add(3.1416);    // pi is autoboxed through method invocation.

        // Unboxing through assignment
        double pi = ld.get(0);
        System.out.println("pi = " + pi);

        /*
        - Declare an ArrayList of Strings.
        - Add 5 names to the collection.
        - Output the Strings onto the console using the enhanced for loop.
        */

        List<String> names = new ArrayList<String>();
        names.add("Orvin");
        names.add("Dagmawi");
        names.add("Susan");
        names.add("Toba");
        names.add("Ammechi");
        names.add("Kerby");
        
        // print(names);
        for( String name: names ){
            System.out.println(name);
        }

        /*
        - Sort the list using the method Collections.sort.
        - Output the sorted List.
        - Shuffle the list, and output the shuffled list.
        */

        System.out.println("The original array is "+names);
        
        Collections.sort(names);
        // print(names);
        System.out.println("The sorted array is "+names);

        Collections.shuffle(names);
        //print(names);
        System.out.println("The shuffled array is "+names);

        /*
        - Search for the name "Susan" in the list.
        - What location was it found?
        - Search for a name that is not in the list.
        - What location is reported?
        */
        String target = "Susan";
        int targetPos = names.indexOf(target);
        if(names.contains(target))
            System.out.printf("\"%s\" was FOUND at position %d in the array\n", target, targetPos+1);
        else
            System.out.printf("\"%s\" was NOT FOUND in the array, it's position is %d\n", target, targetPos);

        target = "David";
        targetPos = names.indexOf(target);
        if(names.contains(target))
            System.out.printf("\"%s\" was FOUND at position %d in the array\n", target, targetPos+1);
        else
            System.out.printf("\"%s\" was NOT FOUND in the array, it's position is %d\n", target, targetPos);

        /*
        - Convert the list above to an array using toArray.
        - Output the elements of the array.
        - Convert the array back into a list using asList.
        - Output the elements of the list.
        */

        Object[] namesArray = names.toArray();
        System.out.println("The new array is "+Arrays.toString(namesArray));


        List<Object> newListNames = Arrays.asList(namesArray);
        //print(names);
        System.out.println("The new list is "+newListNames);

        /*
        - Describe why an equals method and a compareTo method are required to achieve searching and sorting.
            The equals and comparTo methods need to be used for searching and sorting, espeically witth objects that expect
            to utiiliize Collections because they are the only way to compare objects. The compareTo method needs to be 
            overidden so that we can tell if an object is greater or less than anotherr object lexoographically. Addiittoinaly
            this allows us to determine the criteria for which we sort, we could sort a Student object by id numbers or by GPAs
            or ecetera.
        */
    }
}