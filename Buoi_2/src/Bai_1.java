import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("So phan tu cua mang: ");
        n = scanner.nextInt();

        int []a = new int[n];
        System.out.print("Nhap mang: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Trung binh cong cua cac so le o vi tri chan la: " + TBC(a));
        findMin(a);
        
        boolean check = false;
        System.out.print("So chinh phuong trong mang: ");
        for (int i = 0; i < a.length; i++) {
            if (checkSCP(a[i])) {
                System.out.print(a[i] + "  ");
                check = true;
            }
        }
        if (check == false) {
            System.out.print("khong co!");
        }
        System.out.println();

        check = false;
        System.out.print("So nguyen to trong mang: ");
        for (int i = 0; i < a.length; i++) {
            if (checkSNT(a[i])) {
                System.out.print(a[i] + "  ");
                check = true;
            }
        }
        if (check == false) {
            System.out.print("khong co!");
        }
        System.out.println();

        sapXep(a);
        System.out.print("Mang sau khi sap xep: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
   
        scanner.close();
    }

    public static float TBC(int []a) {
        int tbc = 0, count = 0;
        for (int i = 1; i < a.length; i += 2) {
            if (a[i] % 2 == 1) {
                tbc += a[i];
                count += 1;
            }
        }

        tbc = tbc / count;
        return tbc;
    }

    public static void findMin(int []a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.print("Vi tri so nho nhat trong mang: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                System.out.print((i + 1) + "  ");
            }
        }
        System.out.println();
    }

    public static boolean checkSCP (int a) {
        if (Math.ceil(Math.sqrt(a)) == Math.sqrt(a)) {
            return true;
        }
        return false;
    }
    
    public static boolean checkSNT(int a) {

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return a > 1;
    }

    public static void sapXep(int []a) {
        for (int i = 0; i < a.length - 1; i ++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    swap(a, i, j);
                }
            }
        }
    }

    public static void swap(int []a, int i, int j) {
        int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
    }

}
