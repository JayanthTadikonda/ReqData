public class Employee implements Comparable<Employee>{

    private String name;
     int weight;
    private int height;

    public Employee(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.getWeight() == o.getWeight())
            return 0;
        else if(this.getWeight() > o.getWeight())
            return 1;
        else
            return -1;

    }
}
