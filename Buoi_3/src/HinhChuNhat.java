import java.util.Scanner;

public class HinhChuNhat {

    private static Scanner scanner = new Scanner(System.in);
    private double chieuDai;
    private double chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public double dienTich() {
        return chieuDai * chieuRong;
    }
    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public void input() {
        System.out.print("Chieu dai: ");
        chieuDai = scanner.nextDouble();

        System.out.print("Chieu rong: ");
        chieuRong = scanner.nextDouble();
    }

    public void output() {
        System.out.println("Chieu dai: " + chieuDai);
        System.out.println("Chieu rong: " + chieuRong);
    }


    public static void main(String[] args) {
 
        HinhChuNhat a = new HinhChuNhat();
        System.out.println("Nhap thong tin cua hinh chu nhat a: ");
        System.out.print("Chieu dai: "); a.setChieuDai(scanner.nextDouble());
        System.out.print("Chieu rong: "); a.setChieuRong(scanner.nextDouble());

        HinhChuNhat b = new HinhChuNhat();
        System.out.println("Nhap thong tin hinh chu nhat b: ");
        b.input();

        System.out.printf("%-5s%-15s%-15s%-15s%-10s\n", " ", "Chieu dai", "Chieu rong", "Dien tich", "Chu vi");
        System.out.printf("%-5s%-15.2f%-15.2f%-15.2f%-10.2f\n", "a", a.getChieuDai(), a.getChieuRong(), a.dienTich(), a.chuVi());
        System.out.printf("%-5s%-15.2f%-15.2f%-15.2f%-10.2f\n", "b", b.getChieuDai(), b.getChieuRong(), b.dienTich(), b.chuVi());

        soSanh(a, b);
    }

    public static void soSanh(HinhChuNhat a, HinhChuNhat b) {

        if (a.dienTich() > b.dienTich()) {
            System.out.println("a co dien tich lon hon");
        } else if (a.dienTich() < b.dienTich()) {
            System.out.println("a co dien tich nho hon");
        } else {
            System.out.println("2 hinh co dien tich bang nhau");
        }
    }

}