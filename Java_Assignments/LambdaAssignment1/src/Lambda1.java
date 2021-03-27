public class Lambda1 {

    public static void main(String[] args) {

        operations lambdaCalculator = (a, b) -> (a + b);
        System.out.println(lambdaCalculator.calculate(2,4));

        operations divide = (a,b) -> (a / b);
        System.out.println(divide.calculate(9,5));

        operations multiply = (a,b) -> (a * b);
        System.out.println(multiply.calculate(5,9));

        operations subtract = (a,b) -> (a-b);
        System.out.println(subtract.calculate(5,9));

    }
}


