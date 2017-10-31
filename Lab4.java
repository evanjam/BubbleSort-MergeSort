import java.util.*;

public class Lab4
{

	public static void main(String[]args)
	{
		sortFunctions sort = new sortFunctions();
		Scanner cin = new Scanner(System.in);
		Random rng = new Random();

		System.out.println("evan\nlab4\nbubble & merge sorting algorithms");
		System.out.println("specify size of array: ");
		int size = cin.nextInt();
		System.out.println();

		int arr_Ordered[] = new int[size];
		int arr_Reversed[] = new int[size];
		int arr_Random[] = new int[size];

		for(int x=0;x<size;++x)
		{
			arr_Ordered[x] = x+1;
		}

		int temp_Rev = size + 1;
		for(int x=0;x<size;++x)
		{
			arr_Reversed[x] = temp_Rev-1;
			temp_Rev--;
		}

		for(int x=0;x<size;++x)
		{
			arr_Random[x] = rng.nextInt(50);
		}

		int [] bubbleSort_Ordered = new int[size];
		int [] bubbleSort_Reversed = new int[size];
		int [] bubbleSort_Random = new int[size];

		int [] mergeSort_Ordered = new int[size];
		int [] mergeSort_Reversed = new int[size];
		int [] mergeSort_Random = new int[size];

		for(int x=0;x<size;++x)
		{
			bubbleSort_Ordered[x] = arr_Ordered[x];
		}
		
		for(int x=0;x<size;++x)
		{
			bubbleSort_Reversed[x] = arr_Reversed[x];
		}

		for(int x=0;x<size;++x)
		{
			bubbleSort_Random[x] = arr_Random[x];
		}

		sort.bubble(bubbleSort_Ordered);
		System.out.println("bubble sort performed on ordered array.\n\toriginal size: " + size);
		sort.printCount();

		sort.bubble(bubbleSort_Reversed);
		System.out.println("bubble sort performed on reverse ordered array.\n\toriginal size: " + size);
		sort.printCount();

		sort.bubble(bubbleSort_Random);
		System.out.println("bubblesort performed on random ordered array.\n\toriginal size: " + size);
		sort.printCount();

		mergeSort_Ordered = sort.merge(arr_Ordered);
		System.out.println("merge sort performed on ordered array.\n\toriginal size: " + size);
		sort.printCount();

		mergeSort_Reversed = sort.merge(arr_Reversed);
		System.out.println("merge sort performed on ordered array.\n\toriginal size: " + size);
		sort.printCount();

		mergeSort_Random = sort.merge(arr_Random);
		System.out.println("merge sort performed on ordered array.\n\toriginal size: " + size);
		sort.printCount();		

	}
}
