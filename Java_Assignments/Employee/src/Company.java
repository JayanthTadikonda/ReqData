public class Company {
    public static void main(String[] args) {

        Employee e1 = new Employee("Buck",123,29,5000);
        Manager m1 = new Manager("Bob",234,35,10000,222,50);
        Labour l1 = new Labour("maddie",555,3500,45,235,40,10);

        e1.work();
        System.out.println(e1.getSalary());

        m1.manage();
        m1.salary_manager();

        l1.work();
        l1.salary_lab();

        double total_salary = m1.salary_manager() + l1.salary_lab();
        System.out.println(total_salary);
    }
}
