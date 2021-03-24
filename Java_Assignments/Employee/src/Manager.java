public class Manager extends Employee{

    private int mid;
    private double incentive;

    public Manager(String name, int id, int age, double salary, int mid, double incentive) {
        super(name, id, age, salary);
        this.mid = mid;
        this.incentive = incentive;
    }

    public void manage(){
        work();
        System.out.println("Manager is managing.");
    }

    public double salary_manager(){
        double total_sal = this.incentive + getSalary();
        System.out.println("Gross Salary for emp id:" + mid + ", Amt:"+ total_sal);
        return total_sal;
    }


}
