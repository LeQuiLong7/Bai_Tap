import java.util.Scanner;

public class QuanLy {
    private static Scanner scanner = new Scanner(System.in);
    private String maQuanLy;
    private String hoTen;
    
    public QuanLy() {

    }
    public void input() {
        System.out.print("Ma quan ly: "); maQuanLy = scanner.nextLine();
        System.out.print("Ho ten: "); hoTen = scanner.nextLine();
    }
    public void output() {
        System.out.println("Ma quan ly: " + maQuanLy);
        System.out.println("Ho ten: " + hoTen);
    }
    
}
