import java.util.Scanner;

public class May {
    private static Scanner scanner = new Scanner(System.in);
    private String maMay;
    private String kieuMay;
    private String tinhTrang;
    
    public May() {
        
    }
    
    public void input() {
        System.out.print("Ma may: "); maMay = scanner.nextLine();
        System.out.print("Kieu may: "); kieuMay = scanner.nextLine();
        System.out.print("Tinh trang: "); tinhTrang = scanner.nextLine();
    }

    public void output() {
        System.out.println("Ma may: " + maMay);
        System.out.println("Kieu may: " + kieuMay);
        System.out.println("Tinh trang: " + tinhTrang);
    }


}
