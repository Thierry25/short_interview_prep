public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,5,5}; // => 5
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int a : arr){
            if(a > max){
                secondMax = max;
                max = a;
            }else if(a!= max && a > secondMax){
                secondMax = a;
            }
        }
        System.out.println(secondMax);
    }
}