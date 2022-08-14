import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLy {

    private static List<Xe> list = new ArrayList<>();

    private static void output(List<Xe> list) {
        if (!list.isEmpty()) {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia",
                    "Thue truoc ba");
            for (Xe xe : list) {
                System.out.printf("%-20s%-20s%-20d%-20d%-20f\n", xe.getTenChuXe(), xe.getLoaiXe(), xe.getDungTich(),
                    xe.getGiaTri(), xe.getThueTruocBa());
            }
        } else {
            System.out.println("Chua nhap thong tin xe!");
        }
    }

    public void add() {
        Xe xe = new Xe();
        list.add(xe);
    }

    public void output() {
        output(QuanLy.list);
    }

    public void DESCSort() {
        List<Xe> list2 = new ArrayList<>(QuanLy.list);

        Collections.sort(list2, (o1, o2) -> {
            if (o1.getThueTruocBa() > o2.getThueTruocBa()) {
                return -1;
            } else if (o1.getThueTruocBa() == o2.getThueTruocBa()) {
                return 0;
            }
            return 1;
        } );
        output(list2);
    } 

    public void ASCSort() {
        List<Xe> list2 = new ArrayList<>(QuanLy.list);

        Collections.sort(list2, (o1, o2) -> {
            if (o1.getThueTruocBa() < o2.getThueTruocBa()) {
                return -1;
            } else if (o1.getThueTruocBa() == o2.getThueTruocBa()) {
                return 0;
            }
            return 1;
        } );
        output(list2);
    }

}
