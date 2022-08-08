import java.util.Scanner;

public class PhongMay {
    
    private static Scanner scanner = new Scanner(System.in);

    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy quanLy;
    private May may;

    public PhongMay() {

    }

    public void input() {

        System.out.println("\nNhap thong tin phong may");
        System.out.print("Ma phong: "); this.maPhong = scanner.nextLine();
        System.out.print("Ten phong: "); this.tenPhong = scanner.nextLine();
        System.out.print("Dien tich: "); this.dienTich = scanner.nextDouble();
    
        System.out.println("\nNhap thong tin quan ly");
        QuanLy x = new QuanLy(); x.input(); this.quanLy = x;

        System.out.println("\nNhap thong tin may tinh");
        May y = new May(); y.input(); this.may = y;
    }
    
    public void output() {
        System.out.println("\nThong tin phong may");
        System.out.println("Ma phong: " + maPhong);
        System.out.println("Ten phong: " + tenPhong);
        System.out.println("Dien tich: " + dienTich);
    
        System.out.println("\nThong tin quan ly");
        this.quanLy.output();

        System.out.println("\nThong tin may tinh");
        this.may.output();

    }

}
