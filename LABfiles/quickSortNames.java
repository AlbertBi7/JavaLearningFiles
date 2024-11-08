package labPrograms24;
import java.util.Scanner;



public class quickSortNames {

    public static int partition(String[] array, int low, int high) {
        String pivot = array[low];
        int i = low, j = high;

        while (i < j) {
            while (i < high && array[i].compareTo(pivot) <= 0) {
                i++;
            }
            while (array[j].compareTo(pivot) > 0) {
                j--;
            }
            if (i < j) {
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        array[low] = array[j];
        array[j] = pivot;
        return j;
    }

    public static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] array = new String[n];


        for (int i = 0; i <n; i++) {
        	System.out.print("Enter the name of Person "+(i+1)+":");
            array[i] = scanner.nextLine();
        }
        quickSort(array, 0, n - 1);

        System.out.println("The Names after sorting is: ");
        for (String name : array) {
            System.out.println(name);
        }

        scanner.close();
    }
}
