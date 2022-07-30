import java.util.Scanner;

public class PtBac2 {
    
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

    public void calc() {

        double delta = b*b - 4*a*c;
        if(delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.print("Phuong trinh co nghiem kep x = " + (-b / 2*a));
        } else {
            double x1 = (-b + Math.sqrt(delta) / 2*a);
            double x2 = (-b - Math.sqrt(delta) / 2*a);
            System.out.printf("Phuong trinh co 2 nghiem phan biet x1 = %.2f, x2 = %.2f", x1, x2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PtBac2 a = new PtBac2();
        System.out.println("Nhap phuong trinh bac 2: ax^2 + bx + c = 0");
        System.out.print("a: "); a.setA(scanner.nextInt());
        System.out.print("b: "); a.setB(scanner.nextInt());
        System.out.print("c: "); a.setC(scanner.nextInt());

        a.calc();
        scanner.close();
    }
}
