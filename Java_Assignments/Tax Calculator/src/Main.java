public class Main {

    public static void main(String[] args) {
        taxCalculator(186000);
        taxCalculator(3000001);
    }

    public static void taxCalculator(long ctc){

        char slab;
        double tax = 0;
        if(ctc <= 180000){
            System.out.println("slab = A\ntax = 0%");
        } else if(ctc <= 300000){
            System.out.println("slab = B\ntax = 10%");
        } else if(ctc <= 500000){
            System.out.println("slab = C\ntax = 20%");
        }else if(ctc <= 1000000){
            System.out.println("slab = D\ntax = 30%");
        } else {
            System.out.println("Out of Range.");
        }

    }
}
