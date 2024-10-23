package labPrograms24;
import java.util.Scanner;

public class quickSort {
    
    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low, j = high;
        
        while (i < j) {
            while (i < high && array[i] <= pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < j) {
      
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        

        array[low] = array[j];
        array[j] = pivot;
        return j;
    }
    
    public static void quickSort(int[] array, int low, int high) {
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
        int[] array = new int[n];
        
        System.out.print("Enter the Elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("The Array before sorting is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        
        quickSort(array, 0, n - 1);
        
        System.out.print("The Array after sorting is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        
        scanner.close();
    }
}
