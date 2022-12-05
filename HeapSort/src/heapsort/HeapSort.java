package heapsort;

public class HeapSort {

    // i which is an index in array.
    // n is size of heap.
    void heapify(int array[], int n, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {

            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }

    public void sort(int array[]) {

        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {

            heapify(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {

            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }

    }

    static void printArray(int array[]) {
        
        int n = array.length;
        for (int i = 0; i < n; i++) {
            
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int array[] = {12, 11, 13, 5, 6, 7};
        int n = array.length;

        /*
        Heap:
                12
            11      13
           5  6    7
        
         */
        
        HeapSort heapSort = new HeapSort();
        
        System.out.println("Our array is:");
        printArray(array);
        
        heapSort.sort(array);
        System.out.println("Sorted array is:");
        printArray(array);
        
        /*
        Heap:
                 5
             6        7
           11  12   13
        
         */
        
        
    }

}
