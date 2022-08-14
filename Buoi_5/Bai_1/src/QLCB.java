import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class QLCB {

    private static Scanner scanner = new Scanner(System.in);
    private static List<CanBo> list = new ArrayList<>();
    private static Set<String> id = new HashSet<>();

    public void add() {
        System.out.println("Nhap tong tin can bo");
        System.out.print("Id: ");
        String ids = scanner.nextLine();
        while (id.contains(ids)) {
            System.out.println("Trung id!");
            System.out.print("Nhap lai id: "); ids = scanner.nextLine();
        }
        id.add(ids);
        CanBo canBo = new CanBo();
        canBo.setId(ids); canBo.input();

        list.add(canBo);
        System.out.println("Them 1 can bo thanh cong!");
    }

    public void output() {

        if (list.isEmpty()) {
            System.out.println("Chua nhap thong tin can bo!");
        } else {

            System.out.printf("%-10s%-20s%-15s%-15s%s\n", "Id", "Ho Ten", "Nam Sinh", "Gioi Tinh", "Dia Chi");
            for (CanBo canBo : list) {
                System.out.printf("%-10s%-20s%-15d%-15s%s\n", canBo.getId(), canBo.getHoTen(), canBo.getNamSinh(),
                    canBo.getGioiTinh(), canBo.getDiaChi());
            }
        }
    }

    public void delete() {
        System.out.print("Nhap id can bo can xoa: ");
        String ids = scanner.nextLine();
        if (id.contains(ids)) {
            for (CanBo canBo : list) {
                if (canBo.getId().equals(ids)) {
                    list.remove(canBo);
                    break;
                }
            }
            System.out.println("Xoa thanh cong!");
            id.remove(ids);
        } else {
            System.out.println("Khong co can bo co id la " + ids);
        }
    }
    
    public void find() {
        System.out.print("Nhap id can bo can tim: ");
        String ids = scanner.nextLine();
        if(id.contains(ids)) {
            System.out.printf("%-10s%-20s%-8s%-10s%-20s\n", "Id", "Ho Ten", "Nam Sinh", "Gioi Tinh", "Dia Chi");
            for (CanBo canBo : list) {
                if (canBo.getId().equals(ids)) {
                    System.out.printf("%-10s%-20s%-8d%-10s%-20s\n", canBo.getId(), canBo.getHoTen(), canBo.getNamSinh(),
                            canBo.getGioiTinh(), canBo.getDiaChi());
                    break;
                }
            }
        } else {
            System.out.println("Khong co can bo co id la " + ids);
        }
    }

}
