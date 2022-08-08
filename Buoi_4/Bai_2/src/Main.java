import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int select;
        Student[] students = null;

        do {
            System.out.println("\n**********************************************************");
            System.out.println("Chon 1 de nhap danh sach sinh vien");
            System.out.println("Chon 2 de hien thi danh sach sinh vien");
            System.out.println("Chon 3 de tim kiem sinh vien theo id");
            System.out.println("Chon 4 de sua dia chi sinh vien tu Thanh Hoa thanh Hai Phong");
            System.out.println("Chon 5 de xoa sinh vien theo id");
            System.out.println("Chon 6 de thoat chuong trinh");
            System.out.println("**********************************************************");

            System.out.print("\nLua chon cua ban: ");
            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 1:
                    students = input();
                    break;
                case 2:
                    output(students);
                    break;
                case 3:
                    find(students);
                    break;
                case 4:
                    adjust(students);
                    break;
                case 5:
                    students = delete(students);
                    break;
                case 6:
                    System.out.println("Goodbye!");
            }

        } while (select != 6);
    }

    public static boolean check(String[] id, String x, int index) {

        for (int i = 0; i < index; i++) {
            if (x.equals(id[i])) {
                return false;
            }
        }
        return true;
    }

    public static Student[] input() {
        int n;
        System.out.print("Nhap so luong sinh vien: ");
        n = scanner.nextInt();
        String[] id = new String[n];
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nNhap thong tin sinh vien " + (i + 1));
            students[i].input();

            id[i] = students[i].getId();
            if (check(id, students[i].getId(), i) == false) {
                i--;
                System.out.println("\nTrung ma sinh vien!");
            }
        }
        System.out.println("\nNhap thanh cong!");
        return students;
    }

    public static void output(Student[] students) {
        if (students.length == 0) {
            System.out.println("Khong co sinh vien nao!");
        } else {

            System.out.printf("%-10s|%-20s|%-10s|%-15s|%-15s|%-10s\n", "ID", "Ten", "Tuoi", "Huyen", "Tinh",
                    "Ma tinh");
            for (int i = 0; i < students.length; i++) {
                System.out.printf("%-10s|%-20s|%-10d|%-15s|%-15s|%-10d\n", students[i].getId(), students[i].getName(),
                        students[i].getAge(),
                        students[i].getAddress().getProvince(), students[i].getAddress().getDistrict(),
                        students[i].getAddress().getId());
            }
        }
    }

    public static void find(Student[] students) {
        System.out.print("Nhap ma sinh vien can tim: ");
        String id = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (id.equals(students[i].getId())) {
                System.out.printf("%-10s|%-20s|%-10s|%-15s|%-15s|%-10s\n", "ID", "Ten", "Tuoi", "Huyen", "Tinh",
                        "Ma tinh");
                System.out.printf("%-10s|%-20s|%-10d|%-15s|%-15s|%-10d\n", students[i].getId(), students[i].getName(),
                        students[i].getAge(),
                        students[i].getAddress().getProvince(), students[i].getAddress().getDistrict(),
                        students[i].getAddress().getId());
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Khong co sinh vien co ma sinh vien la " + id);
        }
    }

    public static void adjust(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAddress().getProvince().equals("Thanh Hoa")) {
                students[i].getAddress().setProvince("Hai Phong");
            }
        }
        System.out.println("Thay doi thanh cong!");
    }

    public static Student[] delete(Student[] students) {
        System.out.print("Nhap ma sinh vien can xoa: ");
        String id = scanner.nextLine();
        Student[] newStudents = new Student[students.length - 1];
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = 0; j < students.length; j++) {
                    if (j < i) {
                        newStudents[j] = students[j];
                    }
                    if (j > i) {
                        newStudents[j - 1] = students[j];
                    }
                }
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("\nKhong co sinh vien co ma sinh vien la " + id);
        } else {
            System.out.println("\nXoa thanh cong!");
        }
        return newStudents;
    }

}
