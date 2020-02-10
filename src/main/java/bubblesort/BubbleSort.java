package bubblesort;

public class BubbleSort {

	public static void betterSort(int[] array, boolean reverse){
        boolean sorted = false;
        
        if(array == null) {
        	throw new NullPointerException(); 
        } else {
       
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
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index error");
            }
        }
        }
    }
	
}
