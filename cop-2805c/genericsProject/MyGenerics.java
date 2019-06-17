
public class MyGenerics{

    public static <T> int partOne(T[] arr, int arr_len, T target){
        // using linear search because we are not assuming that arr is comparable and/or sorted
        int index = 0;
        while(index < arr_len){
            if( arr[index].equals(target) || arr[index] == target){ // precaution taken incase .equals() method is not overriden
                return index;
            }
            index++;
        }
        return -1;
    }

    private static <T extends Value> int partTwo(T obj1, T obj2){
        return obj1.value() > obj2.value() ? obj1.value() : obj2.value();
    }

    public static void main(String[] args) {
        
    }
}