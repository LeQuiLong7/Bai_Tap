import java.util.Scanner;

public class Address {

    private static Scanner scanner = new Scanner(System.in);
    
    private int id;
    private String district;
    private String province;

    public Address() {

    }

    public int getId() {
        return this.id;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void input() {
        System.out.print("Huyen: "); this.district = scanner.nextLine();
        System.out.print("Tinh: "); this.province = scanner.nextLine();
        System.out.print("Ma tinh: "); this.id = scanner.nextInt(); scanner.nextLine();
    }

}