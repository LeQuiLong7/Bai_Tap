import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLy quanLy = new QuanLy();
        int select;
        do {
            System.out.println("\n****************************");
            System.out.println("Chon 1 de them thong tin 1 xe");
            System.out.println("Chon 2 de xuat bang ke khai tien thue truoc ba cua xe");
            System.out.println("Chon 3 de xuat bang ke khai tien thue truoc ba cua xe voi tien thue giam dan");
            System.out.println("Chon 4 de xuat bang ke khai tien thue truoc ba cua xe voi tien thua tang dan");
            System.out.println("Chon 5 de thoat chuong trinh");
            System.out.println("*********************************");

            System.out.print("\nLua chon cua ban: "); select = scanner.nextInt(); scanner.nextLine();

            switch(select) {
                case 1: 
                    quanLy.add();
                    break;
                case 2: 
                    quanLy.output();
                    break;
                case 3:
                    quanLy.DESCSort();
                    break;
                case 4: 
                    quanLy.ASCSort();
                    break;
                case 5: 
                    System.out.println("Goodbye!");
            }

        } while (select != 5);
    
        scanner.close();
    }
}
