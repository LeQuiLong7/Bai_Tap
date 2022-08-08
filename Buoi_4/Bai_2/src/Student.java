import java.util.Scanner;

public class Student {
    private static Scanner scanner = new Scanner(System.in);

    private String id;
    private String name;
    private int age;
    private Address address;
    
    public Student() {

    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void input() {
        System.out.print("Ma sinh vien: "); this.id = scanner.nextLine();
        System.out.print("Ten: "); this.name = scanner.nextLine();
        System.out.print("Tuoi: "); this.age = scanner.nextInt(); scanner.nextLine();

        Address address = new Address();
        address.input();
        this.address = address;
    }



}
