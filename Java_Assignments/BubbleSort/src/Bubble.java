public class Bubble {

    public static void main(String[] args) {

        int[] a = {3,9,4,5,1,2,6,7,8};

        bubbleSort(a);
    }

    public static void bubbleSort(int[] arr){

        int temp = 0;
        int l = arr.length;
        for(int i=0; i<l; i++) {
            for (int j = 1; j < (l-i); j++) {
                if (arr[j-1]>arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int j:arr){
            System.out.println(j);
        }

    }
}
