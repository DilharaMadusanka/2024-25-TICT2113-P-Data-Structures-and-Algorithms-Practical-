import java.util.Arrays;
public class Bubble_sort{
	
	public static void bubblesort(int[] arr){
		
		int size = arr.length;
		
		for(int i = 0; i < size - 1; i++){
			for(int j = 0; j < size - i - 1 ; j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int data[] = {-2, 45, 0, 11, -9};
		
		System.out.println("Sorted Array in Ascending Order: ");
		bubblesort(data);
        System.out.println(Arrays.toString(data));
		
		
	}
}
