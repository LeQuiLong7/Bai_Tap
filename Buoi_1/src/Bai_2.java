import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap do dai 3 canh cua tam giac:");
        System.out.print("Canh thu nhat: "); a = scanner.nextInt();
        System.out.print("Canh thu hai: "); b = scanner.nextInt();
        System.out.print("Canh thu ba: "); c = scanner.nextInt();

        if (a > c) {
            int tmp = a; a = c; c = tmp;
        }
        if (b > c) {
            int tmp = b; b = c; c = tmp;
        }

        if ( (c * c) == (a * a) + (b * b)) {
            if (a == b) {
                System.out.println("tam giac vuong can");
            } else {
                System.out.println("Tam giac vuong");
            }
        } else if (a == b && b == c) {
            System.out.println("Tam giac deu");
        } else if (a == b || a == c || b == c) {
            System.out.println("Tam giac can");
        } else {
            System.out.println("Tam giac thuong");
        }

        scanner.close();
    }
}   
