public class Main {

    public static void main(String[] args) {
        
        System.out.println(isPrime(5));
        System.out.println(isPrime(20l));
        System.out.println(isPrime(5.6f));
        System.out.println(isPrime(5.9));

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return n > 1;
    }
    public static boolean isPrime(long n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return n > 1;
    }
    public static boolean isPrime(float n) {

        return false;
    }
    public static boolean isPrime(double n) {

        return false;
    }


}