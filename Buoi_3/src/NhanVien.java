import java.util.Scanner;

public class NhanVien {
    
    private static Scanner scanner = new Scanner(System.in);
    private static int x = 1;
    private int maNhanVien;
    private String ten;
    private int tuoi;
    private String diaChi;
    private String boPhanLamViec;

    public NhanVien() {
        this.maNhanVien = x++;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getBoPhanLamViec() {
        return boPhanLamViec;
    }
    public void setBoPhanLamViec(String boPhanLamViec) {
        this.boPhanLamViec = boPhanLamViec;
    }

    void input() {

        System.out.println("Nhap thong tin nhan vien " + maNhanVien );
        System.out.print("Ten: "); ten = scanner.nextLine();
        System.out.print("Tuoi: "); tuoi = scanner.nextInt(); scanner.nextLine();
        System.out.print("Dia chi: "); diaChi = scanner.nextLine();
        System.out.print("Bo phan lam viec: "); boPhanLamViec = scanner.nextLine();
    }

    public void output() {
        System.out.printf("%-10d%-10s%-10d%-10s%-10s\n", maNhanVien, ten, tuoi, diaChi, boPhanLamViec);
    }

    public static void main(String[] args) {

        NhanVien a = new NhanVien(); a.input();
        NhanVien b = new NhanVien(); b.input();
        NhanVien c = new NhanVien(); c.input();
        NhanVien d = new NhanVien(); d.input();
        NhanVien e = new NhanVien(); e.input();

        System.out.println("\t THONG TIN CAC NHAN VIEN");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "MaNV", "Ten", "Tuoi", "DiaChi", "BoPhan");
        a.output(); b.output(); c.output(); d.output(); e.output();
    }
    
}
