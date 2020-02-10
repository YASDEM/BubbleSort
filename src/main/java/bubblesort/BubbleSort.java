package bubblesort;

public class BubbleSort {

	public static void betterSort(int[] array, boolean reverse){
        boolean sorted = false;
       
        while (!sorted) {
            sorted = true;
           
            try {
                for (int i = 0; i < array.length-1; i++) {
                    if (!reverse && array[i] < array[i+1]
                            || reverse && array[i] > array[i+1]) {
                        continue;
                    }
                   
                    sorted = false;
                    int zahl1 = array[i];
                    int zahl2 = array[i+1];
                    array[i] = zahl2;
                    array[i+1] = zahl1;
                }
            } catch (NullPointerException e) {
                System.out.println("needs an array");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index error");
            }
        }
    }
	
}
