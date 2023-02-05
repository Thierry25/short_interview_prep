import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {7,6,5,4,3,2,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

   public static void mergeTwoArrays(int[] firstArr, int[] secondArr, int[] originalArr){
        int first = 0;
        int second = 0;
        int original = 0;

        while(first < firstArr.length && second < secondArr.length){
            if(firstArr[first] < secondArr[second]) originalArr[original++] = firstArr[first++];
            else originalArr[original++] = secondArr[second++];
        }

       while(first < firstArr.length) originalArr[original++] = firstArr[first++];
       while(second < secondArr.length) originalArr[original++] = secondArr[second++];
   }

   public static void mergeSort(int[] arr){
        if(arr.length > 1) {
            int[] firstHalf = new int[arr.length / 2];
            System.arraycopy(arr, 0, firstHalf, 0, firstHalf.length);
            int[] secondHalf = new int[arr.length - arr.length / 2];
            System.arraycopy(arr, arr.length / 2, secondHalf, 0, secondHalf.length);
            mergeSort(firstHalf);
            mergeSort(secondHalf);

            mergeTwoArrays(firstHalf, secondHalf, arr);
        }
   }
}