public class Main {

    public static void main(String[] args) {
        resultCalculator(85,60,75);
        resultCalculator(60,62,25);
        resultCalculator(75,75,75);
    }

    public static void resultCalculator(int s1, int s2, int s3) {

        if(s1>60 && s2>60 && s3>60){
            System.out.println("Passed");

        } else if((s1>60 && s2>60) || (s1>60 && s3>60) || (s2>60 && s3>60)) {
            System.out.println("Promoted");

        } else if((s1>60 || s2>60 || s3>60) || (s1<60 && s2<60 && s3<60)) {
            System.out.println("Failed");
        }
    }
}
