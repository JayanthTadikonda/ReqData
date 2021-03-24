public class Main {

    public static void main(String[] args) {

        double avg = studentMarks(60,75,90);
        int[] a = {60,75,88};
        int[] b = {90,55,78};
        int[] c = {70,85,58};

        System.out.println("AVG marks: "+ avg);

        subjectAvg(a,b,c);
    }

    public static double studentMarks(int s1, int s2, int s3){

        System.out.println("Total :"+ s1+s2+s3);
        return ((s1 + s2 + s3 )/3.0);
    }
    public static void subjectAvg(int[] a, int[] b, int[] c){
        double s1Avg = Math.round((a[0] + b[0] + c[0])/3.0);
        double s2Avg = Math.round((a[1] + b[1] + c[1])/3.0);
        double s3Avg = Math.round((a[2] + b[2] + c[2])/3.0);

        System.out.println("Average in Each subject:\n s1: "+ s1Avg + "\ns2: "+ s2Avg + "\ns3:" + s3Avg);
    }
}
