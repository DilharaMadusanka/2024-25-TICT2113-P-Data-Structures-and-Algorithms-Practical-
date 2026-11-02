import java.util.Arrays;
public class Insertion_sort{
	
	public static void insertionsort(int[] array){
		
		int size = array.length;
		
		for(int step = 1 ; step < size; step++){
			int key = array[step];
            int j = step - 1; 
			while(j >= 0 && key < array[j]){
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key ;
		}
	}
	
	public static void main(String[] args){
		
		int data[] =  {-2, 45, 0, 11, -9};
		
		insertionsort(data);
		System.out.println(Arrays.toString(data));
		
	}
}
