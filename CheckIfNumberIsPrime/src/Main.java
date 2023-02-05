public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
        System.out.println(isPrime(7));
        System.out.println(isPrime(11));
        System.out.println(isPrime(14));
    }

    public static boolean isPrime(int number){
        if(number < 2) return false;

        for(int i = 2; i <= number /2; i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}