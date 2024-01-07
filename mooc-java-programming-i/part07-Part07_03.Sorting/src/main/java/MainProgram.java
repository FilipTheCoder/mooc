
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array) {
        
        int smallest = array[0];
        for(int n : array) {
            if(n < smallest) {
                smallest = n;
            }
        }
        return smallest;
        
    }
    public static int indexOfSmallest(int[] array) {
        int i = 0;
        int smallest = array[i];
        for(int n = 0; n < array.length; n++) {
            if(array[n] < smallest) {
                smallest = array[n];
                i = n;
            }
        }
        return i;
    }
    public static int indexOfSmallestFrom(int[] array, int start) {
        int i = start;
        int smallest = array[i];
        for(int n = start; n < array.length; n++) {
            if(array[n] < smallest) {
                smallest = array[n];
                i = n;
            }
        }
        return i;
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int indexOfSmallest = indexOfSmallestFrom(array, i);
            if(i == indexOfSmallest) {
                continue;
            }
            swap(array, i, indexOfSmallest);
        }
    }

}
