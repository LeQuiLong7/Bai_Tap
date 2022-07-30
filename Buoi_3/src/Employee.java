import java.util.Scanner;

public class Employee {

    private static Scanner scanner = new Scanner(System.in);
    private final int PRICE = 50;

    private String id;
    private String name;
    private int age;
    private int workingDays;   
    private double salary;

    public Employee() {

    }

    public Employee(String id, String name, int age, int workingDays) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public double getSalary() {
        salary = workingDays * PRICE;
        return salary;
    }

    public void input() {

        System.out.println("Nhap thong tin nhan vien");
        System.out.print("Ma nhan vien: "); id = scanner.nextLine();
        System.out.print("Ten: "); name = scanner.nextLine();
        System.out.print("Tuoi: "); age = scanner.nextInt();
        System.out.print("So ngay lam viec: "); workingDays = scanner.nextInt();
    }

    public void output() {
        System.out.println("\nThong tin nhan vien:");
        System.out.printf("Ma nhan vien: %s, Ten: %s, Tuoi: %d, So ngay cong: %d, Luong: %.2f", id, name, age, workingDays, getSalary());
    }
    public static void main(String[] args) {
        
        Employee e = new Employee();
        e.input();
        e.output();

    }
}
