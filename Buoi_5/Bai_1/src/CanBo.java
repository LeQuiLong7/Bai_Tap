import java.util.Scanner;

public class CanBo {
    private static Scanner scanner = new Scanner(System.in);

    private String id;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String diaChi;
    public CanBo() {

    }
    
    public CanBo(String id, String hoTen, int namSinh, String diaChi) {
        this.id = id;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void input() {
        System.out.print("Ho ten: "); this.hoTen = scanner.nextLine();
        System.out.print("Nam sinh: "); this.namSinh = scanner.nextInt(); scanner.nextLine();
        System.out.print("Gioi tinh: "); this.gioiTinh = scanner.nextLine();
        System.out.print("Dia chi: "); this.diaChi = scanner.nextLine();
    }
    
}
