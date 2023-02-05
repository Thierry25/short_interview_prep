public class Main {
    public static void main(String[] args) {
        System.out.println(palindromeNumber(101));
        System.out.println(armstrongNumber(153));
    }

    public static boolean palindromeNumber(int number){
        int initialNumber = number;
        int reverseNumber = 0;
        while(number > 0){
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }
        return reverseNumber == initialNumber;
    }

    public static boolean armstrongNumber(int number){
        int initialNumber = number;
        int reverseNumber = 0;

        while(number > 0){
            int remainder = number % 10;
            reverseNumber = reverseNumber + (int) Math.pow(remainder, 3);
            number /= 10;
        }
        return reverseNumber == initialNumber;
    }
}