import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 90, 87, 55, 33, 43, 54, 34};
        Scanner sc = new Scanner(System.in);
        searchElement(a,2);
    }

    public static int searchElement(int[] a, int key) {
        System.out.println("Enter element to search: ");
        for (int j=0; j<a.length;j++) {
            if (a[j] == key) {
                System.out.println("Element is present at pos: " + j);
                return j;
                }
            }return -1;
        }
}

