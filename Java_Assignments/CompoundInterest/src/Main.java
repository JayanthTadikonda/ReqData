public class Main {

    public static void main(String[] args) {
        simpleInterest(10000,5,12);

    }

    public static void simpleInterest(double principalAmount, double rate, int time){
        double si = 0;
        double ci = 0;

        si = (principalAmount*rate*time)/100;
        ci = Math.round((principalAmount * Math.pow((1 + (rate/100)),time)) - principalAmount);

        System.out.println("Simple Interest: " + si + "\n Compound Interest: " + ci);
    }

}
