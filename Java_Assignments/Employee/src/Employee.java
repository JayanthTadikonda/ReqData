public class Employee {

    private String name;
    private int id;
    private int age;
    private double salary;

    public Employee(String name, int id, int age, double salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee Working.");
    }

    public void rest(){
        System.out.println("Employee Resting.");
    }

    public double getSalary() {
        return salary;
    }
}
