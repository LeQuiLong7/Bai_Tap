import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = scanner.nextLine();
        str = str.trim();
        str = str.replaceAll("[0-9]", "");
        str = str.replaceAll(" +", " ");
        str = str.toLowerCase();
        char[] temp = str.toCharArray();
        temp[0] -= 32;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == ' ') {
                temp[i + 1] -= 32;
            }
        }        
        str = String.valueOf(temp);

        System.out.println(str);

        scanner.close();
    }
}
