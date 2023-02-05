public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("%d %d %n", a, b);
       printFibonacci(10);
    }

    public static void printFibonacci(int number){
        int a = 0, b = 1, c = 1;

        for(int i = 1; i <= number; i++){
            System.out.printf("%d, ", a);
            a = b;
            b = c;
            c = a + b;
        }
    }
    public static int recursiveFib(int number){
        if(number <= 1) return number;

        return recursiveFib(number - 1) + recursiveFib( number - 2);
    }
}