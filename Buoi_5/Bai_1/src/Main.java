import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        int select;
        do {
            System.out.println("\n**************************************************");
            System.out.println("Chon 1 de them 1 can bo");
            System.out.println("Chon 2 de hien thi danh sach cac can bo");
            System.out.println("Chon 3 de xoa 1 can bo theo id");
            System.out.println("Chon 4 de tim kiem 1 can bo theo id");
            System.out.println("Chon 5 de dung chuong trinh");
            System.out.println("****************************************");
            System.out.print("\nLua chon cua ban: "); select = scanner.nextInt(); scanner.nextLine();
            System.out.println();

            switch (select) {
                case 1:
                    qlcb.add();
                    break;
                case 2:
                    qlcb.output();
                    break;
                case 3: 
                    qlcb.delete();
                    break;
                case 4: 
                    qlcb.find();
                    break;
                case 5: 
                    System.out.println("Goodbye!");
            }

        } while (select != 5);

        scanner.close();
    }
}
