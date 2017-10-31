import java.util.*;

public class sortFunctions
{
	static int counter = 0;

	public static void print(int[] a)
	{
		for(int x=0;x<a.length;++x)
			System.out.print("\t" + x);
		System.out.println();
		for(int x=0;x<a.length;++x)
			System.out.print("\t" + a[x]);
		System.out.println();
		System.out.println("number of operations performed by the sorting algorithm: " + counter);
		counter = 0;
	}
	public static void printCount()
	{
		System.out.println("\tnumber of operations performed by the sorting algorithm: " + counter + "\n");
		counter = 0;
	}

	public static int[] bubble(int[] a)
	{
		for(int x=0;x<a.length;++x)
		{
			for(int y=0;y<a.length-1;++y)
			{
				if(a[y] > a[y+1])
				{
					int temp = a[y];
					a[y] = a[y+1];
					a[y+1] = temp;
				}
				counter++;
			}
		}
		return a;
	}

	public static int[] merge(int[] a)
	{
		if(a.length <=1)
			return a;
		int[] firstHalf = new int[a.length/2];
		int[] secondHalf = new int[a.length - firstHalf.length];

		for(int x=0;x<firstHalf.length;++x)
		{
			firstHalf[x] = a[x];
		}
		for(int x=0;x<secondHalf.length;++x)
		{
			secondHalf[x] = a[firstHalf.length + x];
		}
		return mergeStep(merge(firstHalf), merge(secondHalf));
	}

	public static int[] mergeStep(int[] one, int[] two)
	{
		int [] newArray = new int[one.length+two.length];
		int indexOne = 0;
		int indexTwo = 0;
		int position = 0;

		while( (indexOne < one.length) && (indexTwo <two.length) )
		{
			if(one[indexOne] < two[indexTwo])
			{
				newArray[position] = one[indexOne];
				indexOne++;
			}
			else
			{
				newArray[position] = two[indexTwo];
				indexTwo++;
			}
			position++;
			counter++;
		}

		while(indexOne < one.length)
		{
			newArray[position] = one[indexOne];
			indexOne++;
			position++;
			counter++;
		}
		while(indexTwo < two.length)
		{
			newArray[position] = two[indexTwo];
			indexTwo++;
			position++;
			counter++;
		}
		return newArray;
	
	}
		
}
