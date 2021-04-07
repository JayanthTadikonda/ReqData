public class TestingDemo {

    CalculatorService service;

    TestingDemo(CalculatorService service){
        this.service = service;
    }

    public int mult(int i, int j){
        return i*j;
    }

    public int add(int a, int b){
        int sum = a+b;
        System.out.println("Adding Numbers: "+ sum);
        return sum;
    }

    public int multiply(int i, int i1) {
        System.out.println("Multiplication: "+i*i1);
        return i*i1;
    }

    public int div(int i, int i1) {
        System.out.println("Division: " + i/i1);
        return i/i1;
    }
}
