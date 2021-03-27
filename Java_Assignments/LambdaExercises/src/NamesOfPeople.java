public class NamesOfPeople {

    private String name;

    public NamesOfPeople(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamesOfPeople{" +
                "name='" + name + '\'' +
                '}';
    }
}
