public class Labour extends Employee{

    private int lid;
    private int overtime;
    private int rate;

    public Labour(String name, int id, double salary, int age, int lid, int overtime, int rate) {
        super(name, id, age, salary);
        this.lid = lid;
        this.overtime = overtime;
        this.rate = rate;
    }

    public void cleaning(){
        work();
        System.out.println("Employee is cleaning.");
    }


    public double salary_lab() {

        double total_sal = (this.rate*this.overtime) + getSalary();
        System.out.println("Gross Salary for emp id:" + lid + ", Amt:"+ total_sal);
        return total_sal;
    }
}
