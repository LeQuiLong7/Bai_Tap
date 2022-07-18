import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.print("Nhap n: "); n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        System.out.println("Tong cac uoc cua n la: " + sum);

        scanner.close();
    }
}
