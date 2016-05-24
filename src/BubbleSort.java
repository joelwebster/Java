import java.util.Arrays;

public class BubbleSort {
	public static void main (String[] args) {
		// create numbers array
		int [] numbers = {7,3,10,9,1,2};
		boolean swapped = true; // set flag to true to begin first pass
		int temp; // swap variable
		
		while (swapped) {
			swapped = false; // set to false to prevent infinite loop
		for (int i=0;i<numbers.length-1;i++) {
				if (numbers[i]>numbers[i+1]) { // if number in current index is bigger than next index
					// swap
					temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					swapped = true; // mark as swapped = work left to do
				}
			
		}
		
		}
		System.out.print(Arrays.toString(numbers));
	}
}
