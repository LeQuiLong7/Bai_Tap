import java.util.Scanner;

public class Xe {
    private static Scanner scanner = new Scanner(System.in);

    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private int giaTri;
    private double thueTruocBa;

    public Xe() {
        this.intput();
    } 

    public String getTenChuXe() {
        return tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public int getGiaTri() {
        return giaTri;
    }

    public double getThueTruocBa() {
        return thueTruocBa;
    }
    public void intput() {
        System.out.println("Nhap thong tin xe");
        System.out.print("Ten chu xe: "); this.tenChuXe = scanner.nextLine();
        System.out.print("Loai xe: ");  this.loaiXe = scanner.nextLine();
        System.out.print("Dung tich: "); this.dungTich = scanner.nextInt(); scanner.nextLine();
        System.out.print("Gia xe: "); this.giaTri = scanner.nextInt(); scanner.nextLine();
        if (this.dungTich < 100) {
            thueTruocBa = giaTri * 2.0 / 100;
        } else if (this.dungTich <= 200) {
            thueTruocBa = giaTri * 6.0 / 100;
        } else {
            thueTruocBa = giaTri / 10.0;
        }
    }


}
