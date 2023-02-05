import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1,1,2,2,3,4,5};
        Integer[] arr2 = {6,7,8,9,10};
        System.out.println(sameElements(arr1, arr2));
    }

    public static <T> boolean sameElements(T[] arr1, T[] arr2){
        Set<T> uniqueElements1 = new HashSet<>(Arrays.asList(arr1));
        Set<T> uniqueElements2 = new HashSet<>(Arrays.asList(arr2));

        if(uniqueElements1.size() != uniqueElements2.size()) return false;
        for(T el : uniqueElements1){
            if(!uniqueElements2.contains(el)) return false;
        }
        return true;
    }
}