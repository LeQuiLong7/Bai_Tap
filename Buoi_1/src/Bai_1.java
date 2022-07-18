import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        int day, month, year;

        System.out.println("Nhap ngay thang nam sinh: ");
        System.out.print("Ngay sinh: "); day = scanner.nextInt();
        System.out.print("Thang sinh: "); month = scanner.nextInt();
        System.out.print("Nam sinh: "); year = scanner.nextInt();

        if ((day >= 20 && month == 1) || (day <= 18 && month == 2)) {
            System.out.println("Cung Bao Binh");
        } else if ((day >= 19 && month == 2) || (day <= 20 && month == 3)) {
            System.out.println("Cung Song Ngu");
        } else if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
            System.out.println("Cung Bach Duong");
        } else if ((day >= 21 && month == 4) || (day <= 20 && month == 5)) {
            System.out.println("Cung Kim Nguu");
        } else if ((day >= 21 && month == 5) || (day <= 21 && month == 6)) {
            System.out.println("Cung Song Tu");
        } else if ((day >= 22 && month == 6) || (day <= 22 && month == 7)) {
            System.out.println("Cung Cu Giai");
        } else if ((day >= 23 && month == 7) || (day <= 22 && month == 8)) {
            System.out.println("Cung Su Tu");
        } else if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) {
            System.out.println("Cung Xu Nu");
        } else if ((day >= 23 && month == 9) || (day <= 23 && month == 10)) {
            System.out.println("Cung Thien Binh");
        } else if ((day >= 24 && month == 10) || (day <= 22 && month == 11)) {
            System.out.println("Cung Bo Cap");
        } else if ((day >= 23 && month == 11) || (day <= 21 && month == 12)) {
            System.out.println("Cung Nhan Ma");
        } else {
            System.out.println("Cung Ma Ket");
        }

        scanner.close();
    }
}
